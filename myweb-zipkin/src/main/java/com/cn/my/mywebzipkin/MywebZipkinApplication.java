package com.cn.my.mywebzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@EnableEurekaClient
@SpringBootApplication
@EnableZipkinStreamServer
public class MywebZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(MywebZipkinApplication.class, args);
    }

}

