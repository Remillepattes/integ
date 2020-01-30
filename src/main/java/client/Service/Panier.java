package client.Service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;

import client.Entity.Product;
import client.dao.ProductDAO;

public class Panier {
	protected List<Product> products = new ArrayList<Product>();
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	public List<Product> getProducts() {
		return products;
	}
	public double getPrice() {
		double price = 0;
		
		for (Product product : products) {
			price+=product.getPrice_product();
		}
		return price;
	}
}