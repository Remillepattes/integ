package orm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pers;

	@ManyToOne
	private Civilite civilite;

	@OneToMany(mappedBy = "personne")
	private List<Commande> commandes;

	@ManyToOne
	private Adresse adresse;

	private String nom_pers;

	private String prenom_pers;

	private String tel_pers;

	private String email_pers;

	private boolean statut_pers;

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public List<Commande> getListCommande() {
		return commandes;
	}

	public void setListCommande(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public String getNom() {
		return nom_pers;
	}

	public void setNom(String nom_pers) {
		this.nom_pers = nom_pers;
	}

	public String getPrenom() {
		return prenom_pers;
	}

	public void setPrenom(String prenom_pers) {
		this.prenom_pers = prenom_pers;
	}

	public String getTel() {
		return tel_pers;
	}

	public void setTel(String tel_pers) {
		this.tel_pers = tel_pers;
	}

	public String getEmail() {
		return email_pers;
	}

	public void setEmail(String email_pers) {
		this.email_pers = email_pers;
	}

	public boolean getStatut() {
		return statut_pers;
	}

	public void setStatut(boolean statut_pers) {
		this.statut_pers = statut_pers;
	}
}
