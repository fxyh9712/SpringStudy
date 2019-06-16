package com.fxyh.spring.util;

import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

/**
 * @ClassName: Dom4jUtils
 * @description: dom4j工具类
 * @author: fengzhaoquan
 * @create: 2019-06-16 16:52
 * @Version 1.0
 **/
public class Dom4jUtils {

    /**
     * @Author fengzhaoquan
     * @Description 获取XML文档。其实就是将xml文档读取到内存中，形成DOM树
     * @Date  
     * @Param 
     * @return 
     **/
    public static Document getDocument(String fileName){
        Document document = null;
        if(StringUtils.isBlank(fileName)){
            throw new IllegalArgumentException("");
        }
        try {
            SAXReader reader = new SAXReader();
            document = reader.read(Dom4jUtils.class.getClassLoader().getResourceAsStream(fileName));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return document;
    }

}
