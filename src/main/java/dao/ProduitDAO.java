package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import orm.Produit;

@Stateless
public class ProduitDAO {

	@PersistenceContext(unitName="nivantis")
	 private EntityManager em;
	
	public Produit getByName(String nom) {
		 
		 return em.createQuery("select p from Produit p where p.nom_prod = :name", Produit.class)
		            .setParameter("name", nom)
		            .getSingleResult();

	}
	
	public List<Produit> getListeProduitsActifs() {

		return em.createQuery("select p from Produit p where p.statut_prod = 0", Produit.class).getResultList(); 
	}
	
	public List<Produit> getTousProduits() {

		return em.createQuery("select p from Produit p", Produit.class).getResultList(); 
	}
	
	public List<Produit> getListeProduitsInactifs() {

		return em.createQuery("select p from Produit p where p.statut_prod = 1", Produit.class).getResultList(); 
	}
}
