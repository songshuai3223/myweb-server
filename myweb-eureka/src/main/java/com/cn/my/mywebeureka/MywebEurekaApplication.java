package com.cn.my.mywebeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MywebEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MywebEurekaApplication.class, args);
    }

}

