package com.kimschool.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimschool.manage.dao.FindPasswordDao;
import com.kimschool.manage.entity.Jpa_Test;

@Service
public class FindPasswordServiceImpl implements FindPasswordService {

	@Autowired
	FindPasswordDao dao;
	
	@Override
	public String findPassword(String id, String email1, String email2) {

		Jpa_Test jpatest = new Jpa_Test();
		jpatest.setId(id);
		String email = email1 + "@" + email2;
		jpatest.setEmail(email);
		
		String result = dao.findpassword(id, email);
		
		if (result == "") {
			return result;
		} else {
			
			String password = "";
			char[] charList = result.toCharArray();
			for (int i = 1; i < result.length()-1; i ++) {
				charList[i]='*';
			}
			password = new String(charList);
			
			return password;
		}
	}

	
}

//		String password1 = result.substring(0, 1);
//		String password2_1 = result.substring(1, result.length()-1);
//		String password2 = result.substring(1, result.length()-1);
//		String password3 = result.substring(result.length()-1, result.length());
//		
//		String password = password1 + " " + password2 + " " + password3;