package orm;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pharmacie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_pharmacie;
	
	@ManyToOne
	private Adresse adresse;
	
    @OneToMany(mappedBy="pharmacie")
    private List<Commande> commandes;
    
	@ManyToMany
	@JoinTable(name = "travail",
	           joinColumns = @JoinColumn(name = "id_pharmacie"),
	           inverseJoinColumns = @JoinColumn(name = "id_pers"))
	private List<Personne> personnes = new ArrayList<>();
	
	private String nom_pharmacie;
	
	private Integer statut_pharmacie;


	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public List<Commande> getListCommande() {
		return commandes;
	}
	public List<Personne> getListPersonne() {
		return personnes;
	}
	public void setListPersonne(List<Personne> personnes) {
		this.personnes = personnes;
	}
	public void setListCommande(List<Commande> commandes) {
		this.commandes = commandes;
	}
	public String getNom() {
		return nom_pharmacie;
	}
	public void setNom(String nom_pharmacie) {
		this.nom_pharmacie = nom_pharmacie;
	}
	public Integer getStatut() {
		return statut_pharmacie;
	}
	public void setStatut(Integer statut_pharmacie) {
		this.statut_pharmacie = statut_pharmacie;
	}
}
