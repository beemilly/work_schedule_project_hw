package com.kimschool.manage.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.kimschool.manage.entity.Jpa_Test;

public abstract class LoginDaoImpl implements LoginDao {

	// jpa 사용에 필요한 필수객체 두개
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("testdb");
	EntityManager em = emf.createEntityManager();
					
	@Override
	public int logincheck(String id, String password) {
		// select * from jpa_test where no = 1;
		Jpa_Test result = em.find(Jpa_Test.class, 1); //no
		System.out.println(result);
		return 0;
	}

}
