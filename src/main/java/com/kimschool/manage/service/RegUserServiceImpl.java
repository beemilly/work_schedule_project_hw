package com.kimschool.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimschool.manage.dao.RegUserDao;
import com.kimschool.manage.entity.Jpa_Test;

@Service
public class RegUserServiceImpl implements RegUserService {

	@Autowired
	RegUserDao dao;
	
	@Override
	public int insertUserInfo(String id, String password, String email1, String email2) {

		Jpa_Test jpatest = new Jpa_Test();
		jpatest.setId(id);
		jpatest.setPassword(password);
		String email = email1 + "@" + email2;
		jpatest.setEmail(email);
		
		int result = dao.insertUserInfo(jpatest);
		
		return result;
	}

}
