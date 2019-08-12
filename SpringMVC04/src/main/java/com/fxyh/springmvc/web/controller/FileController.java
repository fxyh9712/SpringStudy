package com.fxyh.springmvc.web.controller;

import com.fxyh.springmvc.common.CustomException;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file")
public class FileController {

    @Value("${spring.upload.max_size_per_file}")
    private Long maxUploadPerFile;

    @Value("${spring.upload.max_size_total}")
    private Long maxSizeTotal;

    @Value("${spring.upload.allow_upload_file_type}")
    private String allowUploadFileType;

    @GetMapping("/upload")
    public String upload() {
        return "file/upload";
    }

    @PostMapping("/upload")
    public Object upload(MultipartFile file, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String uploadPath = session.getServletContext().getRealPath("/files");
        File uploadFile = new File(uploadPath);
        if (!uploadFile.exists()) {
            uploadFile.mkdirs();
        }
        String filename = file.getOriginalFilename();
        try {
            file.transferTo(new File(uploadFile, filename));
            request.setAttribute("msg", filename + "上传成功");
        } catch (IOException e) {
            e.printStackTrace();
            request.setAttribute("msg", filename + "上传失败");

        }
        return "file/success";
    }

    @PostMapping("/uploads")
    public Object uploads(MultipartFile[] file, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String uploadPath = session.getServletContext().getRealPath("/files");
        File uploadFile = new File(uploadPath);
        if (!uploadFile.exists()) {
            uploadFile.mkdirs();
        }
        StringBuffer sb = new StringBuffer();
        for (MultipartFile multipartFile : file) {
            String filename = multipartFile.getOriginalFilename();
            String extension = FilenameUtils.getExtension(filename);
            if (allowUploadFileType.indexOf(extension) < 0){
                throw new CustomException("上传文件的类型不允许，只能上传" + allowUploadFileType + "文件");
            }
            long size = multipartFile.getSize();
            if (size > maxUploadPerFile) {
                throw new CustomException("文件大小超过了" + maxUploadPerFile / 1024 / 1024 + "MB");
            }
            try {
                multipartFile.transferTo(new File(uploadFile, filename));
                sb.append(filename).append("上传成功,");
            } catch (IOException e) {
                e.printStackTrace();
                sb.append(filename).append("上传失败,");
            }
        }
        request.setAttribute("msg", sb.toString());
        return "file/success";
    }
}

