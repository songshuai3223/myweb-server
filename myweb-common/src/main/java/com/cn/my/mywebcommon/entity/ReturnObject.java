package com.cn.my.mywebcommon.entity;

/**
 * 
 * 项目：gykdh
 * 版    权: Copyright(C) 2011-2020,  gzcb. All rights reserved
 * 类名：ReturnMessage
 * 描述：json返回之前的值
 * 创建人：liting    创建日期：2016年11月4日   版本：
 * 历史
 * <修改人>   <修改日期 >   <修改内容>
 */
public class ReturnObject{

	private String code="00";
	
	private String message;
	
	private Object result;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
	
	
}
