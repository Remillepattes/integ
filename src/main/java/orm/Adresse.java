package orm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Ville ville;
	
	@OneToMany(mappedBy="adresse")
    private List<Pharmacie> pharmacies ;
	
	@OneToMany(mappedBy="adresse")
    private List<Personne> personnes ;
	
	private String ligne1_adresse;
	
	private String ligne2_adresse;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	
	public List<Pharmacie> getListPharmacie() {
		return pharmacies;
	}
	public void setListPharmacie(List<Pharmacie> pharmacies) {
		this.pharmacies = pharmacies;
	}
	public List<Personne> getListPersonne() {
		return personnes;
	}
	public void setListPersonne(List<Personne> personnes) {
		this.personnes = personnes;
	}
	public String getLigne1Adresse() {
		return ligne1_adresse;
	}
	public void setLigne1Adresse(String ligne1_adresse) {
		this.ligne1_adresse = ligne1_adresse;
	}
	public String getLigne2Adresse() {
		return ligne2_adresse;
	}
	public void setLigne2Adresse(String ligne2_adresse) {
		this.ligne2_adresse = ligne2_adresse;
	}
}
