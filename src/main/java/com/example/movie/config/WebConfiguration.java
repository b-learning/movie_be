/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.movie.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author giaba
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    // rest api
    // 4 method
    /*
        - Get
        - Post
        - Put
        - Delete
    */
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // nhận yêu cầu từ bất cư front end nào
        registry.addMapping("/**").allowedMethods("*");
    }
}
