package orm;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Produit {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_prod;
	
    @OneToMany(mappedBy="produit")
    private List<LigneCommande> lignesCommande;
	
	private String nom_prod;
	
	private String type_prod;
	
	private String voie_administration_prod;
	
	private float prix_prod;
	
	private boolean statut_prod;
	
	
	public String getNom() {
		return nom_prod;
	}
	public void setNom(String nom_prod) {
		this.nom_prod = nom_prod;
	}
	public String getType() {
		return type_prod;
	}
	public void setType(String type_prod) {
		this.type_prod = type_prod;
	}
	public String getVoieAdmi() {
		return voie_administration_prod;
	}
	public void setVoieAdmi(String voie_administration_prod) {
		this.voie_administration_prod = voie_administration_prod;
	}
	public float getPrix() {
		return prix_prod;
	}
	public void setPrix(float prix_prod) {
		this.prix_prod = prix_prod;
	}
	public boolean getStatut() {
		return statut_prod;
	}
	public void setStatut(boolean statut_prod) {
		this.statut_prod = statut_prod;
	}
}