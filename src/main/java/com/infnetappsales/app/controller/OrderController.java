
package com.infnetappsales.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infnetappsales.app.dto.OrderDTO;
import com.infnetappsales.app.services.OrderService;


@RestController

@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping	
    public List<OrderDTO> getCostumers() {
    	return orderService.getAll();
    }
    
    @PostMapping
    public OrderDTO storeUser(@RequestBody OrderDTO order) {
    	return orderService.save(order);
    }
}
