package com.lxw.lipicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan("com.lxw.lipicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class LiPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiPictureBackendApplication.class, args);
    }

}
