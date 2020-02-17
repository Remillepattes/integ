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
	//@EJB
	private ProductService productService = new ProductService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Tous les produits</title>");
	    out.println("</head>");
	    out.println("<body bgcolor=\"white\">");
	    /*
	    out.println("<p>Chaise grise</p>");
	    out.println("<p>Chaise verte</p>");
	    out.println("<p>Chaise marron</p>");
	    out.println("<p>Chaise violette</p>");
	    */
	    
	    
	    for (Product p : productService.getProductList()) {
	    	out.println("<p>"+p.getName_product()+"</p>");
		}
	    out.println("</body>");
	    out.println("</html>");
	}
	
	

	@GET
	@Produces("application/json")
	public List<Product> getPieces() {
	return productService.getProductList();
	}

}
