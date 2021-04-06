package com.infnetappsales.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infnetappsales.dto.ProductDTO;
import com.infnetappsales.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	public ProductRepository productRepository;

	public List<ProductDTO> getAll() {
		return (List<ProductDTO>) productRepository.findAll();
	}

	public ProductDTO save(ProductDTO product) {
		return productRepository.save(product);
	}

	public ProductDTO update(ProductDTO product, Long id) {
		product.setId(id);
		return productRepository.save(product);
	}

	public Optional<ProductDTO> getById(Long id) {
		return productRepository.findById(id);
	}

	public Optional<ProductDTO> deteletById(Long id) {
		Optional<ProductDTO> user = productRepository.findById(id);
		productRepository.deleteById(id);

		return user;
	}

	public Boolean exists(Long id) {
		return productRepository.existsById(id);
	}
}
