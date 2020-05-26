package com.kimschool.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.service.WbsService;

@Controller
public class WbsController {

	@Autowired
	WbsService wbsservice;
	
	
	
//	@RequestMapping("/wbs")
//	public ModelAndView init() {
//		
//		ModelAndView mv = new ModelAndView("wbs");
//		
//		return mv;
//	}
	
	@RequestMapping("wbslogincheck")
	public ModelAndView wbslogincheck(String u_no, String u_password) {
		
		ModelAndView mv = wbsservice.wbslogincheck(u_no, u_password);
		
		return mv;
	}
	
	@RequestMapping("getwbsinfo")
	public ModelAndView getwbsinfo(String u_no) {
		
		ModelAndView mv = wbsservice.getwbsinfo(u_no);
		
		return mv;
	}
	
	
}
