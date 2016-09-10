package com.ljheee.spring.di;

import java.util.Date;
import java.util.Set;

public class MessageService {

	private String message;
	private Date time;
	
	private Set<String> info;
	
	public void setMessage(String message) {
		this.message = message;
	}

	public MessageService(String message, Date time) {
		super();
		this.message = message;
		this.time = time;
	}




	public MessageService(String message, Date time, Set<String> info) {
		super();
		this.message = message;
		this.time = time;
		this.info = info;
	}


	/**
	 * Constraction
	 * @param message
	 */
	public MessageService(String message) {
		this.message = message;
	}



	public void showMessage(){
		System.out.println("Show:"+message);
	}
	
	
	/**
	 * 回调方法--容器自动选择时机调用
	 * 初始化
	 */
	public void init(){
		System.out.println("init");
	}
	/**
	 * 回调方法--容器自动选择时机调用
	 * 销毁
	 */
	public void destory(){
		System.out.println("destory");
	}
}
