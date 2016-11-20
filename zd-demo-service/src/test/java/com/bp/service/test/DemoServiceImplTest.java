package com.bp.service.test;

import org.junit.Test;
import org.springframework.context.annotation.Configuration;

import com.bp.entity.Student;
import com.bp.service.DemoService;
import com.bp.serviceImpl.DemoServiceImpl;

/**
 * 
 * @author current_bp
 * @createTime 20161120
 *
 */

public class DemoServiceImplTest extends BaseTest {
	
	@Test
	public void save(){
		DemoService ds = new DemoServiceImpl();
		
		Student student = new Student();
		student.setId(1L);
		student.setName("baopan");
		student.setAddress("address");
		student.setCourse(100);
		
		ds.save(student);
	}

}
