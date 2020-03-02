package com.example.reader.config.springsecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 有效的方法
 * 全局异常处理用户权限不足
 * @author wuyang
 * @version 1.0
 * @date 2019/9/18 19:51
 */
@Component
public class AuthenticationAccessDeniedHandler implements AccessDeniedHandler {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        logger.info("用户权限不足");
    }
}
