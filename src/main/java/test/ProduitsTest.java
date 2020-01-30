package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controler.HelloResource;
import model.ProduitService;
import orm.Produit;

class ProduitsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void getListProduitsTest() {
		
		ProduitService produit = new ProduitService();
		
		List<Produit> y = produit.getListeProduits();
		
		//assert.assertEquals(true, y.sta);
	}
}
