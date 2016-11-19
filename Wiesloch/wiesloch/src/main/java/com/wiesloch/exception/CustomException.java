package com.wiesloch.exception;

/**
 * 
 * ClassName:CustomException<br/>
 * Description:自定义异常类<br/>
 * E-mail:weijianyututu@163.com <br/>
 * Date: 2016年4月29日 下午4:10:42 <br/>
 * 
 * @author SevenKey
 * @version 1.0
 * @since JDK 1.7
 *
 */
public class CustomException extends Exception {
	// 定义异常信息
	public String message;

	public CustomException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
