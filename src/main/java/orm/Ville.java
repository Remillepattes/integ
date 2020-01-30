package orm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ville {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_ville;
	
	@OneToMany(mappedBy="ville")
	private List<Adresse> adresses;
	
	private String libelle_ville;
	
	private String cp_ville;
	
	public Integer getIdVille() {
		return id_ville;
	}
	public void setIdVille(Integer id_ville) {
		this.id_ville = id_ville;
	}
	public List<Adresse> getListAdresse() {
		return adresses;
	}
	public void setListAdresse(List<Adresse> adresses) {
		this.adresses = adresses;
	}
	public String getLibelle() {
		return libelle_ville;
	}
	public void setLibelle(String libelle_ville) {
		this.libelle_ville = libelle_ville;
	}
	public String getCp() {
		return cp_ville;
	}
	public void setCp(String cp_ville) {
		this.cp_ville = cp_ville;
	}
}
