
package com.infnetappsales.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infnetappsales.app.dto.OrderDTO;
import com.infnetappsales.app.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	public OrderRepository orderRepository;

	public List<OrderDTO> getAll() {
		return (List<OrderDTO>) orderRepository.findAll();
	}

	public OrderDTO save(OrderDTO order) {
		return orderRepository.save(order);
	}
}
