package com.infnetappsales.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infnetappsales.dto.CostumerDTO;
import com.infnetappsales.services.CostumerService;

@RestController 
@RequestMapping("/clients")
public class CostumerController {

	@Autowired
	private CostumerService cs;

	@GetMapping
	public List<CostumerDTO> getClients(){
		return cs.getAll();
	}

	@PostMapping
	public CostumerDTO storeClient(@RequestBody CostumerDTO client) {
		return cs.save(client);
	}

	@PatchMapping("/{id}")
	public CostumerDTO patchClient(@RequestBody CostumerDTO client, @PathVariable Long id) {
		if(!cs.exists(id)) return null;

		return cs.update(client, id);
	}

	@GetMapping("/{id}")
	public CostumerDTO getClient (@PathVariable Long id) {
		Optional<CostumerDTO> client = cs.getById(id);
		if(client.isEmpty())return null;

		return client.get();
	}

	@DeleteMapping("/{id}")
	public Optional<CostumerDTO> deleteClient(@PathVariable Long id){
		if(!cs.exists(id)) return null; 
	
		return cs.deleteById(id);
	}
}
