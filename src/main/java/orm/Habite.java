package orm;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Habite {

	private Integer id_personne;
	
	private Integer id_adresse;

	
	public Integer getIdAdresse() {
		return id_adresse;
	}
	public void SetIdAdresse(Integer id_adresse) {
		this.id_adresse = id_adresse;
	}
	public Integer getIdPersonne() {
		return id_personne;
	}
	public void setIdPersonne(Integer id_personne) {
		this.id_personne = id_personne;
	}
}
