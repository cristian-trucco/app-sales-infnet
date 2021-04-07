package com.infnetappsales.app.repository;
import org.springframework.data.repository.CrudRepository;

import com.infnetappsales.app.dto.CostumerDTO;

public interface CostumerRepository extends CrudRepository<CostumerDTO,Long> {

}
