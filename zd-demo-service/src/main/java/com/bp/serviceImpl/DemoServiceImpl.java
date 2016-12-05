package com.bp.serviceImpl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.bp.entity.Student;
import com.bp.service.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

	public Integer save(Student student) {
		System.out.println("savestudent:"+JSON.toJSONString(student));
		return 1;
	}

	public Integer delete(Student student) {
		System.out.println("deletestudent:"+JSON.toJSONString(student));
		return 1;
	}

}
