package com.infnetappsales.app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CostumerDTO  {

	@Id
	@GeneratedValue
	private Long id;
	private String first_name;
	private String last_name;
	private String cpf;
	private String email;
	private String telefone;
	private String custome_details;
	
	public CostumerDTO() {

	}

	public CostumerDTO(String first_name, String cpf, String email) {
		this.first_name = first_name;
		this.cpf = cpf;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return first_name;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}
	

	public String getTelefone() {
		return telefone;
	}

	public String getCustome_details() {
		return custome_details;
	}

	public void setCustome_details(String custome_details) {
		this.custome_details = custome_details;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


}
