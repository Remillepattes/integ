package orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommande {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
    @ManyToOne
    private Commande commande;
	
    @ManyToOne
	private Produit produit;
	
	private Integer id_commande;
	
	private String libelle_ligneCom;
	
	private Integer quantite_ligneCom;

	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdCom() {
		return id_commande;
	}
	public void setIdCom(Integer id_commande) {
		this.id_commande = id_commande;
	}
	public String getLibelle() {
		return libelle_ligneCom;
	}
	public void setLibelle(String libelle_ligneCom) {
		this.libelle_ligneCom = libelle_ligneCom;
	}
	public Integer getQuantite() {
		return quantite_ligneCom;
	}
	public void setQuantite(Integer quantite_ligneCom) {
		this.quantite_ligneCom = quantite_ligneCom;
	}
}
