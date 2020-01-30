package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controler.HelloResource;
import model.OrderService;
import model.ProduitService;
import orm.Commande;
import orm.Produit;

class OrderTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void createOrderTest() {
		
		Date date = new Date();
		
		Commande order = new Commande();
		
		order.setLibelle("test");
		order.setDateCreation(date);
		order.setDateFacturation(date);
		
		OrderService orderService = new OrderService();
		
		orderService.createOrder(order);
		
		//assert.assertEquals(true, y.sta);
	}
}