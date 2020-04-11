import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.kimschool.manage.entity.Jpa_Test;

public class App {

	public static void main(String[] args) {

		// jpa 사용에 필요한 필수객체 두개
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testdb");
		EntityManager em = emf.createEntityManager();
				
		// select * from jpa_test where no = 2;
		Jpa_Test result = em.find(Jpa_Test.class, 2); //no
				
		System.out.println(result);
		
	}

}
