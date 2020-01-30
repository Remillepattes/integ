package orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PharmacieTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	
	@BeforeAll
	public static void initEmf() {
		emf = Persistence.createEntityManagerFactory("nivantis-test");
	}
	
	@Test
	public void nefaitrien() {
		
	}

	@AfterAll
	public static void closeEmf() {
		emf.close();
	}
}
