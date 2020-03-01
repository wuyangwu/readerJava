package com.example.reader.config.WebMvcConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 访问配置
        registry.addResourceHandler("/img/**").addResourceLocations("file:D:/reader/readerJava/image/");
//        super.addResourceHandlers(registry);
    }

}
