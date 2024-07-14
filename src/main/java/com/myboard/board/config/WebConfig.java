package com.myboard.board.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    // view 에서 사용할 경로
    // 즉 화면에서 사용하는 경로
    private String resourcePath = "/upload/**";
    // 실제 파일 저장 경로
    private String savePath = "file:///Users/janghwan/My_WokrSpace/spring_board_upload_files/";

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(resourcePath)
                .addResourceLocations(savePath);
    }
}
