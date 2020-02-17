package client.Service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import client.Entity.Product;
import client.dao.ProductDAO;

@Stateless
public class ProductService {
	@EJB
	private ProductDAO produitDAO;

	public List<Product> getProductList() {
		//avec JDBC
		//return produitDAO.getProducts();
		
		List<Product> products = new ArrayList<Product>();
		//Sans JDBC
		Product parbrise = new Product();
		parbrise.setDesc_product("1");
		parbrise.setName_product("Parbrise");
		parbrise.setPrice_product(112);
		products.add(parbrise);
		
		Product retroviseur = new Product();
		retroviseur.setDesc_product("2");
		retroviseur.setName_product("Rétroviseur");
		retroviseur.setPrice_product(40);
		products.add(retroviseur);
		
		Product vitre = new Product();
		vitre.setDesc_product("3");
		vitre.setName_product("Vitre");
		vitre.setPrice_product(49);
		products.add(vitre);
		
		Product feuAVG = new Product();
		feuAVG.setDesc_product("4");
		feuAVG.setName_product("Feu avant gauche");
		feuAVG.setPrice_product(70);
		products.add(feuAVG);
		return products;
	}

}
