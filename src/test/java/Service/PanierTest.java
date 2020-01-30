package Service;

import static org.junit.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import client.Entity.Product;
import client.Service.Panier;

public class PanierTest {

	@BeforeEach
	protected void setUp() throws Exception {
		
	}

	@Test
	public void getPriceTest() {
		Product parbrise = new Product();
		parbrise.setDesc_product("1");
		parbrise.setName_product("Parbrise");
		parbrise.setPrice_product(112);
		
		Product retroviseur = new Product();
		retroviseur.setDesc_product("2");
		retroviseur.setName_product("Rétroviseur");
		retroviseur.setPrice_product(40);
		
		
		Panier panier = new Panier();
		panier.addProduct(parbrise);
		panier.addProduct(retroviseur);
		assertEquals(112+40, panier.getPrice(), 0);
	}
		
}
