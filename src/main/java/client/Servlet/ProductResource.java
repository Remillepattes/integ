package client.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import client.Entity.Product;
import client.Service.ProductService;

@Path("/products")
public class ProductResource extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		getPieces();
		System.out.println(getPieces());
	}
	
	@EJB
	private ProductService productService;

	@GET
	@Produces("application/json")
	public List<Product> getPieces() {
	return productService.getProductList();
	}

}
