import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.kimschool.manage.entity.Jpa_Test;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testdb");
		EntityManager em = emf.createEntityManager();
				
		Jpa_Test result = em.find(Jpa_Test.class, 2); //no
				
		System.out.println(result);
		
	}

}
