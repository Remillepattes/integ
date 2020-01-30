package orm;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_commande;

	@OneToMany(mappedBy = "commande")
	private List<LigneCommande> lignesCommande;

	@ManyToOne
	private Pharmacie pharmacie;

	@ManyToOne
	private Personne personne;

	private String libelle_commande;

	private Date dateCreation_commande;

	private Date dateFacturation_commande;

	public Pharmacie getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(Pharmacie pharmacie) {
		this.pharmacie = pharmacie;
	}

	public List<LigneCommande> getListLigneCommande() {
		return lignesCommande;
	}

	public void setListLigneCommande(List<LigneCommande> lignesCommande) {
		this.lignesCommande = lignesCommande;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public String getLibelle() {
		return libelle_commande;
	}

	public void setLibelle(String libelle_commande) {
		this.libelle_commande = libelle_commande;
	}

	public Date getDateCreation() {
		return dateCreation_commande;
	}

	public void setDateCreation(Date dateCreation_commande) {
		this.dateCreation_commande = dateCreation_commande;
	}

	public Date getDateFacturation() {
		return dateFacturation_commande;
	}

	public void setDateFacturation(Date dateFacturation_commande) {
		this.dateFacturation_commande = dateFacturation_commande;
	}
}
