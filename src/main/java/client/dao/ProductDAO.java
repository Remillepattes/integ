package client.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import client.Entity.Product;


@Stateless
public class ProductDAO {
	@PersistenceContext(unitName="epsi-contrat")
	 private EntityManager em;
	
	public Product getByName(String nom) {
		 
		 return em.createQuery("select p from Product p where p.name_product = :name", Product.class)
		            .setParameter("name", nom)
		            .getSingleResult();

	}
	
	public List<Product> getProducts() {

		return em.createQuery("select p from Product p", Product.class).getResultList(); 
	}
	

}
