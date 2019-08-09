package com.fxyh.springmvc.web.controller;

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
}

