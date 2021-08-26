package com.coder.employee.dtos.response;

import java.util.List;

public class Response {
	
	public String setResponse(final String response) {
		return response;
	}
	private String name;
	private List<?> dataList;
	public Response(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Response(List<?> dataList) {
		this.dataList = dataList;
	}
	public List<?> getDataList() {
		return dataList;
	}
	public void setDataList(List<?> dataList) {
		this.dataList = dataList;
	}
	
}
