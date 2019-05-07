package com.cn.my.mywebconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class MywebConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MywebConfigApplication.class, args);
    }

}

