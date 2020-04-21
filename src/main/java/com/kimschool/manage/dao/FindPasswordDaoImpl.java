package com.kimschool.manage.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class FindPasswordDaoImpl implements FindPasswordDao {

	@Autowired
	Connection conn;
	
	@Override
	public String findpassword(String id, String email) {

		EntityManager em = conn.getConnection();

		String result = null;
		try {
			result = em.createNamedQuery("Jpa_Test.findpassword", String.class).
					setParameter("id", id).
					setParameter("email", email).
					getSingleResult();
		} catch (NoResultException e) {
			result = "";
		}
		
		String password = result.toString();
		
		return password;
	}

}
