package com.cn.my.codegenerator;

import com.cn.my.codegenerator.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeGeneratorApplication {

    @Autowired
    private GeneratorService generatorService;
    public static void main(String[] args) {
        SpringApplication.run(CodeGeneratorApplication.class, args);
    }
}
