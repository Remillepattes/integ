package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import orm.Commande;
import orm.LigneDevis;
import orm.Produit;

@Stateless
public class OrderDAO {
	
	@PersistenceContext(unitName="nivantis")
	private EntityManager em;
	
	public void create(Commande order) {
		em.persist(order);
	}
	
	public List<Commande> getAllOrders(){
		return em.createQuery("select o from Commande o", Commande.class).getResultList();
	}
}
