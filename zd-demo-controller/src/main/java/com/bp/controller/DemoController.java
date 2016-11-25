package com.bp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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


	@RequestMapping(value = "useDemo", method = RequestMethod.GET)
	@ResponseBody
	public String list(String name, HttpServletRequest request) {
		System.out.println("===>name:"+name);
		return name;
	}

}
