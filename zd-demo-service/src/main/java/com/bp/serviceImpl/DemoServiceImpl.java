package com.bp.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.bp.entity.Student;
import com.bp.service.DemoService;

/**
 * 
 * @author current_bp
 * @createTime 20161120
 *
 */
public class DemoServiceImpl implements DemoService {

	public Integer save(Student student) {
		System.out.println("===>save:" + JSON.toJSON(student));
		return 1;
	}

	public Integer delete(Student student) {
		System.out.println("===>delete:" + JSON.toJSON(student));
		return 1;
	}

}
