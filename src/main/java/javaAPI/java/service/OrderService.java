package javaAPI.java.service;

import java.util.List;

import javaAPI.java.domain.Order;

import org.springframework.data.domain.Pageable;

public interface OrderService {

	public Order getOrder(Long id);
	public void deleteOrder(Long id);
	public List<Order> findOrdersByName(String name);
	public void createOrder(Order order);
	public void updateOrder(Order order, Long id);
	public List<Order> getOrders(Pageable pageable);	
}
