package com.example.reader.config.WebMvcConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.nio.charset.MalformedInputException;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/11/12 20:41
 */
@ControllerAdvice
public class CustomExceptionHandler {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public void uploadException(MaxUploadSizeExceededException e , HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        logger.info("上传文件大小超出限制");
//        System.out.println("上传文件大小超出限制");
        out.write("上传文件大小超出限制");
        out.flush();
        out.close();
    }
}
