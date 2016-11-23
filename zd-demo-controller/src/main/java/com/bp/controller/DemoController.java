package com.bp.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 * @author current_bp
 * @createTime 20161121
 *
 */
@Controller("demoController")
@RequestMapping("/demo")
public class DemoController extends BaseController{
	
	private final static Logger logger = Logger.getLogger(DemoController.class);
	
//	@Autowired
//	private DemoService 

}
