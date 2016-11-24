package com.bp.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bp.entity.Student;
import com.bp.service.DemoService;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "/spring/applicationContext.xml" });
		context.start();
		DemoService demoService = (DemoService) context.getBean("demoService"); // get
		// service
		// invocation
		// proxy
		Integer count = 0;
		try {
			Student student = new Student();
			student.setId(10L);
			student.setName("baopan");
			count = demoService.save(student);
		} catch (Exception e) {
			e.printStackTrace();
		} // do invoke!
		System.out.println(Thread.currentThread().getName() + " " + count);
	}
}
