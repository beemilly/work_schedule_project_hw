package com.kimschool.manage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kimschool.manage.entity.Jpa_Test;


@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	Connection conn;
	
	@Override
	public int findUser(String id, String password) {

		EntityManager em = conn.getConnection();
		List<Jpa_Test> result = em.createNamedQuery("Jpa_Test.findBypassword", Jpa_Test.class).
				setParameter("password", password).
				setParameter("id", id).
				getResultList();
				
		int size = result.size();
		
		return size;
	}

	
	
	
	
//	// jpa 사용에 필요한 필수객체 두개
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("testdb");
//	EntityManager em = emf.createEntityManager();
					
//	@Override
//	public int logincheck(String id, String password) {
//		// select * from jpa_test where no = 1;
//		Jpa_Test result = em.find(Jpa_Test.class, 1); //no
//		System.out.println(result);
//		return 0;
//	}

}
