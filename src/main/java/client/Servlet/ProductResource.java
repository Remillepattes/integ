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
	    out.println("<!DOCTYPE html>\r\n" + 
	    		"<html>\r\n" + 
	    		"  <head>\r\n" + 
	    		"  	<meta charset=\"UTF-8\">\r\n" + 
	    		"    <title>Boutique RCR</title>\r\n" + 
	    		"    <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n" + 
	    		"  </head>");
	    out.println("<body>");
	    out.println("<header>\r\n" + 
	    		"  <h2> Liste des produits</h2>\r\n" + 
	    		"</header>\r\n" + 
	    		"  <div class=\"topnav\">\r\n" + 
	    		"  	<a href=\"./\">RCR</a>\r\n" + 
	    		"  	<a class=\"active\" href=\"./products\">Liste des produits</a>\r\n" + 
	    		"  	<a href=\"./about.html\">A propos</a>\r\n" + 
	    		"</div>");
	    out.println("<article>");
	    
	    out.println("<table style=\"width:50%;\" align=\"center\">");
	    out.println("<tr>");
	    out.println("<th >Nom du produit</th>");
	    out.println("<th > Description</th>");
	    out.println("<th >Prix</th>");
	    out.println("</tr>");

	    for (Product p : productService.getProductList()) {
	    	out.println("<tr>");
	    	out.println("<td  >"+p.getName_product()+"</td>");
	    	out.println("<td >"+p.getDesc_product()+"</td>");
	    	out.println("<td >"+p.getPrice_product()+" e</td>");
	    	out.println("</tr>");
		}
	    out.println("</table>");
	    out.println("  </article>");
	    out.println("</body>");
	    out.println("</html>");
	}

	@GET
	@Produces("application/json")
	public List<Product> getPieces() {
	return productService.getProductList();
	}

}
