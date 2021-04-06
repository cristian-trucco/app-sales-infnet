package com.infnetappsales.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProductDTO {

	@Id
	@GeneratedValue
	private long id;
    private String product_type_code;
    private String name;

    public ProductDTO() {

    }

    public ProductDTO(String product_type_code, String name) {
    	this.product_type_code = product_type_code;
    	this.name = name;
    }

    public Long getId() {
        return id;
    }

	public String getName() {
		return name;
	}

	public String getType_Code() {
		return product_type_code;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
