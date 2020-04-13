package com.kimschool.manage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.service.LoginService;


@Controller
public class LoginController {
	
	@Autowired
	LoginService loginservice;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "/")
	public ModelAndView login() {
		
		logger.debug("초기처리");
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("login");
		
		return mv;
	}
	
//	@RequestMapping(value = "/logincheck")
//	// id, password 파라메터 << 화면에서 전달된 name값과 자동 매핑
//	public ModelAndView logincheck(String id, String password) {
//		
//		logger.info("로그인체크 실행");
//		if ("admin".equals(id) && "admin".equals(password)) {
//			ModelAndView mv = new ModelAndView("main");
//			return mv;
//		} else {
//			ModelAndView mv = new ModelAndView("login");
//			return mv;
//		}
//		
//	}
	
	@RequestMapping(value = "/logincheck")
	public ModelAndView logincheck(String id, String password) {
		
		logger.debug("로그인 체크 처리를 시작합니다.");
		
		ModelAndView mv = new ModelAndView("result");
		
		int count = loginservice.checklogin(id, password);
		
		mv.addObject("count", count);
		
		return mv;
	}
}
