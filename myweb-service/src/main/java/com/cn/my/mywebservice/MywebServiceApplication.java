package com.cn.my.mywebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableCaching
@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@EnableTransactionManagement
public class MywebServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MywebServiceApplication.class, args);
    }


}

