package com.infnetappsales.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.infnetappsales.app.dto.OrderDTO;

public interface OrderRepository extends CrudRepository<OrderDTO, Long> {

}

