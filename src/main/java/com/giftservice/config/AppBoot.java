package com.giftservice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan(basePackages = {"com.giftservice"})
@EnableAutoConfiguration
@SpringBootApplication
public class AppBoot extends WebMvcConfigurerAdapter {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(AppBoot.class);
        app.run(args);
    }

}