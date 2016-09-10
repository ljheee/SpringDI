package com.ljheee.spring.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");//���·�����������ļ�
//		context = new FileSystemXmlApplicationContext("d:/user/bean.xml");//����·��
		
		
		MessageService m1 = (MessageService) context.getBean("ms1");
		MessageService m12 = (MessageService) context.getBean("ms1");
		
		MessageService m2 = (MessageService) context.getBean("ms1");
		MessageService m22 = (MessageService) context.getBean("ms1");
		
		System.out.println(m1==m12);
		System.out.println(m2==m22);
		
		context.registerShutdownHook();
		context.close();
		
	}

}
