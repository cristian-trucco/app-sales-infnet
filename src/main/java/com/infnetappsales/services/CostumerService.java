package com.infnetappsales.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infnetappsales.dto.CostumerDTO;
import com.infnetappsales.repository.CostumerRepository;

@Service
public class CostumerService {

	@Autowired
	private CostumerRepository cr;

	public List<CostumerDTO> getAll() {
		return (List<CostumerDTO>) cr.findAll();
	}

	public CostumerDTO save(CostumerDTO client) {
		return cr.save(client);
	}

	public CostumerDTO update(CostumerDTO client, Long id) {
		client.setId(id);
		return cr.save(client);
	}

	public Optional<CostumerDTO> getById(Long id) {
		return cr.findById(id);
	}

	public Optional<CostumerDTO> deleteById(Long id) {
		Optional<CostumerDTO> client = cr.findById(id);
		cr.deleteById(id);
		return client;
	}

	public Boolean exists(Long id) {
		return cr.existsById(id);
	}
}
