package orm;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Travail {

	private Integer id_pers;
	
	private Integer id_pharmacie;

	
	public Integer getIdPers() {
		return id_pers;
	}
	public void setIdPers(Integer id_pers) {
		this.id_pers = id_pers;
	}
	public Integer getIdPharmacie() {
		return id_pharmacie;
	}
	public void setIdPharmacie(Integer id_pharmacie) {
		this.id_pharmacie = id_pharmacie;
	}
}
