package orm;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Stock {

	private Integer id_pharmacie;
	
	private Integer id_prod;

	private Integer quantite_stock;
	
	
	public Integer getIdPharmacie() {
		return id_pharmacie;
	}
	public void setIdPharmacie(Integer id_pharmacie) {
		this.id_pharmacie = id_pharmacie;
	}
	public Integer getIdProd() {
		return id_prod;
	}
	public void setIdProd(Integer id_prod) {
		this.id_prod = id_prod;
	}
	public Integer getQuantite() {
		return quantite_stock;
	}
	public void setQuantite(Integer quantite_stock) {
		this.quantite_stock = quantite_stock;
	}
}
