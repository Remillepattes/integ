package client.Servlet;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import client.Entity.Product;
import client.Service.ProductService;

@Path("/products")
public class ProductResource {

	@EJB
	private ProductService productService;

	@GET
	@Produces("application/json")
	public List<Product> getPieces() {
	return productService.getProductList();
	}

}
