package com.cn.my.codegenerator.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.FileNotFoundException;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@WebAppConfiguration
@SpringBootTest
public class GeneratorServiceTest {
    @Autowired
    private GeneratorService generatorService;

    @Test
    public void testGeneratorCode() throws FileNotFoundException {
        String[] tableNames = new String[] { "salary"};
        byte[] data = generatorService.generatorCode(tableNames);
    }
}
