package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import orm.Commande;
import orm.LigneCommande;
import orm.LigneDevis;
import orm.Produit;

@Stateless
public class LigneDevisDAO {
	
	@PersistenceContext(unitName="nivantis")
	private EntityManager em;
	
	public void create(LigneDevis ldevis) {
		em.persist(ldevis);
	}
}
