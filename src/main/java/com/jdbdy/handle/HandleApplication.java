package com.jdbdy.handle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class HandleApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandleApplication.class, args);
    }

}
