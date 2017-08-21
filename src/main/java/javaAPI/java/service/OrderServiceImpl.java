package javaAPI.java.service;

import lombok.extern.log4j.Log4j;

import org.springframework.stereotype.Service;

@Service("orderService")
@Log4j
public class OrderServiceImpl implements OrderService {
	
//	@Autowired
//	private OrderRepository orderRepo;
//
//	@Transactional
//	public Order getOrder(Long id) {
//		//log.debug("Inside get order");
//		return orderRepo.findOne(id);
//	}
//
//	@Transactional
//	public List<Order> findOrdersByName(String name) {
//		if (StringUtils.isEmpty(name)) {
//			return orderRepo.findAll();
//		}
//		return orderRepo.findOrdersByName(name);
//	}
//
//	@Transactional
//	public void createOrder(Order order) {
//		orderRepo.saveAndFlush(order);
//	}
//	
//	@Transactional
//	public void updateOrder(Order order, Long orderId){
//		Order oldOrder = orderRepo.findOne(orderId);
//		BeanUtils.copyProperties(order, oldOrder,"id");		
//		orderRepo.saveAndFlush(oldOrder);
//	}
//
//	@Transactional
//	public void deleteOrder(Long id) {
//		orderRepo.delete(id);
//	}
//
//	@Transactional
//	public List<Order> getOrders(Pageable pageable) {
//		return orderRepo.findAll(pageable).getContent();
//	}

}
