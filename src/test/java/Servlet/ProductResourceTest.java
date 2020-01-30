package Servlet;



import static org.junit.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import client.Servlet.ProductResource;
import junit.framework.TestCase;

public class ProductResourceTest{

	@BeforeEach
	protected void setUp() throws Exception {

	}
	
	@Test
	public void getProductsTest() {
		int statusCode = 0;
		try{
			URL url = new URL("http://localhost:8080/epsi-contrat/api/products");
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
			statusCode = http.getResponseCode();
		}
		catch(Exception e){
			
		}
		assertEquals(200, statusCode);
	}
}
