package com.kimschool.manage.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

@Component
public class Connection {

	public EntityManager getConnection() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testdb");
		EntityManager em = emf.createEntityManager();
		
		return em;
	}
	
	
}
