import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {

		// jpa 사용에 필요한 필수객체 두개
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testdb");
		EntityManager em = emf.createEntityManager();
				
		
	}

}
