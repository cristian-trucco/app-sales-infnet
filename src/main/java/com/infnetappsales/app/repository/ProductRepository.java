package com.infnetappsales.app.repository;
import org.springframework.data.repository.CrudRepository;

import com.infnetappsales.app.dto.ProductDTO;

public interface ProductRepository extends CrudRepository<ProductDTO,Long> {

}
