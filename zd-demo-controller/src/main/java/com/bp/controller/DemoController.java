package com.bp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bp.entity.Student;
import com.bp.service.DemoService;

/**
 * 
 * @author current_bp
 * @createTime 20161121
 *
 */
@Controller("demoController")
@RequestMapping("/demo")
public class DemoController {

	private final static Logger logger = Logger.getLogger(DemoController.class);

	@Autowired
	private DemoService demoService;

	@RequestMapping(value = "useDemo", method = RequestMethod.GET)
	@ResponseBody
	public String list(String name, HttpServletRequest request) {
		Student student = new Student();
		
		student.setId(10L);
		student.setName(name);
		student.setAddress("baopanAddress");
		
		logger.info("===>useDemo: student:"+JSON.toJSONString(student));
		
		return ""+demoService.save(student);
	}

}
