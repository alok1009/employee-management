package com.coder.employee.exception;

public class EmployeeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3546247527555862411L;
	private String msg;
	private String code;
	public EmployeeException(String code,String msg) {
		super();
		this.msg = msg;
		this.code = code;
	}
	public EmployeeException(String code,String msg,Throwable throwable) {
		super();
		this.msg = msg;
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
