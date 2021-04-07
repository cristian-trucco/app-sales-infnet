package com.infnetappsales.app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProductDTO {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private Double price;
	private String product_type_code;

	

	public ProductDTO() {

	}

	public ProductDTO(String name, String product_type_code, Double price) {
		this.name = name;
		this.product_type_code = product_type_code;
		this.price = price;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getProduct_type_code() {
		return product_type_code;
	}

	public void setProduct_type_code(String product_type_code) {
		this.product_type_code = product_type_code;
	}
	

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}