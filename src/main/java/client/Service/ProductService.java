package client.Service;

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

		return produitDAO.getProducts();
	}

}
