package com.bp.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String list(String name) {
		System.out.println("===>name:"+name);
		demoService.save(new Student(1L,name));
		return name;
	}

}
