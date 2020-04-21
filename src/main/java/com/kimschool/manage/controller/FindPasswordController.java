package com.kimschool.manage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.service.FindPasswordService;

@Controller
public class FindPasswordController {

	@Autowired
	FindPasswordService service;
	
	private static final Logger logger = LoggerFactory.getLogger(FindPasswordController.class);
	
	@RequestMapping("/movefindpassword")
	public String movefindpassword () {
		logger.debug("패스워드찾기 화면으로");
		return "findpassword";
	}
	
	@RequestMapping("/findpassword")
	public ModelAndView findpassword(String id, String email1, String email2) {
		
		logger.debug("비밀번호찾기중");
		ModelAndView mv = new ModelAndView();
		
		String result = service.findPassword(id, email1, email2);
		
		if (result == "") {
			mv.addObject("msg", "Password_is_not_found");
			mv.setViewName("redirect:/movefindpassword"); 
		} else {
			mv.addObject("result", result);
			mv.setViewName("findpasswordresult");
		}
		return mv;
	}
	
	
}
