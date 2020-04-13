package com.kimschool.manage.dao;


// 인터페이스의 특징
// 알맹이가 없다(형태만 가지고 있다)
// 메소드의 목차와 같은 역할
public interface LoginDao   {

	
	
	//public int logincheck(String id, String password);
	public int findUser(String id, String password);
	
	
	
}
