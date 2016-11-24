package com.bp.serviceImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "/spring/applicationContext.xml" });
		context.start();

		System.out.println("新浪微博：疯狂的杨中仁.");

		System.in.read(); // 按任意键退出
	}
}
