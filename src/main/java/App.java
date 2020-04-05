import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.kimschool.manage.entity.jpa_test;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testdb");
		EntityManager em = emf.createEntityManager();
				
		jpa_test result = em.find(jpa_test.class, 2); //no
				
		System.out.println(result);
		
	}

}
