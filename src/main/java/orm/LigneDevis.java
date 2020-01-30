package orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LigneDevis {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
    
    private int commande;
	
    @ManyToOne
	private Produit produit;
	
	private Integer quantitee;
	
	private Integer taux;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCommande() {
		return commande;
	}

	public void setCommande(int commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Integer getQuatitee() {
		return quantitee;
	}

	public void setQuatitee(Integer quatitee) {
		this.quantitee = quatitee;
	}

	public Integer getTaux() {
		return taux;
	}

	public void setTaux(Integer taux) {
		this.taux = taux;
	}
	
	
}
