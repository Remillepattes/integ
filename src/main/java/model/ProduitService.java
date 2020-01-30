package model;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.ProduitDAO;
import orm.Produit;

@Stateless
public class ProduitService {
	
	@EJB
	private ProduitDAO produitDAO;

	public List<Produit> getListeProduits() {

		return produitDAO.getTousProduits();
	}
}
