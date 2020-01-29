package client.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_product;
	
	private String name_product;
	
	private String desc_product;
	
	private double price_product;

	public Integer getId_product() {
		return id_product;
	}

	public void setId_product(Integer id_product) {
		this.id_product = id_product;
	}

	public String getName_product() {
		return name_product;
	}

	public void setName_product(String name_product) {
		this.name_product = name_product;
	}

	public String getDesc_product() {
		return desc_product;
	}

	public void setDesc_product(String desc_product) {
		this.desc_product = desc_product;
	}

	public double getPrice_product() {
		return price_product;
	}

	public void setPrice_product(double price_product) {
		this.price_product = price_product;
	}

	
}
