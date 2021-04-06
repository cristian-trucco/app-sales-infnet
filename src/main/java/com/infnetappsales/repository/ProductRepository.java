package com.infnetappsales.repository;
import org.springframework.data.repository.CrudRepository;

import com.infnetappsales.dto.ProductDTO;

public interface ProductRepository extends CrudRepository<ProductDTO,Long> {

}
