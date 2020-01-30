package orm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Civilite {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_civ;
	
	@OneToMany(mappedBy="civilite")
	private List<Personne> personnes;
	
	private String libelle_civ;
	
	
	public Integer getIdCiv() {
		return id_civ;
	}
	public void setIdCiv(Integer id_civ) {
		this.id_civ = id_civ;
	}
	public List<Personne> getListPersonnes() {
		return personnes;
	}
	public void setListPersonne(List<Personne> personnes) {
		this.personnes = personnes;
	}
	public String getLibelle() {
		return libelle_civ;
	}
	public void setLibelle(String libelle_civ) {
		this.libelle_civ = libelle_civ;
	}
}
