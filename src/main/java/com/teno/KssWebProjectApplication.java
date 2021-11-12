package com.teno;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.teno.mapper")
@SpringBootApplication
public class KssWebProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(KssWebProjectApplication.class, args);
    }

}
