package com.cn.my.codegenerator.service.impl;

import com.cn.my.codegenerator.dao.GeneratorMapper;
import com.cn.my.codegenerator.service.GeneratorService;
import com.cn.my.codegenerator.utils.GenUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;


@Service
public class GeneratorServiceImpl implements GeneratorService {
	@Autowired
	GeneratorMapper generatorMapper;

	@Override
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> list = generatorMapper.list();
		return list;
	}

	@Override
	public byte[] generatorCode(String[] tableNames) throws FileNotFoundException {
//		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(new File("E:\\code.zip")));

		for(String tableName : tableNames){
			//查询表信息
			Map<String, String> table = generatorMapper.get(tableName);
			//查询列信息
			List<Map<String, String>> columns = generatorMapper.listColumns(tableName);
			//生成代码
			GenUtils.generatorCode(table, columns, zip);
		}
		IOUtils.closeQuietly(zip);
		return null;
	}

}
