package com.simplehrms.classes;

import com.simplehrms.common.config.JpaConfig;
import com.simplehrms.common.config.OpenApiConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableDiscoveryClient
@Import({JpaConfig.class, OpenApiConfig.class})
public class ClassApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClassApplication.class, args);
    }
}