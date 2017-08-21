package javaAPI.java.web;

import java.util.Collection;
import java.util.List;

import lombok.extern.log4j.Log4j;

import javaAPI.java.domain.Order;
import javaAPI.java.domain.Item;
import javaAPI.java.service.OrderService;
import javaAPI.java.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Log4j
@RequestMapping("/orders")
@RestController
public class OrderController {
	
//	@Autowired
//	private OrderService orderService;
//	@Autowired
//	private ItemService itemService;

	@RequestMapping(method=RequestMethod.GET)
	public boolean orders(@RequestParam(required=false) String name){
		return true;
	}
//	
//	@RequestMapping(method=RequestMethod.POST)
//	@ResponseStatus(HttpStatus.CREATED)
//	public void saveOrder(@RequestBody Order order){
//		//log.debug("Saving new order");
//		orderService.createOrder(order);		
//	}
//	
//	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
//	@ResponseStatus(HttpStatus.ACCEPTED)
//	public void updateOrder(@RequestBody Order order, @PathVariable Long id){
//		orderService.updateOrder(order, id);
//	}
//	
//	@RequestMapping(value="/{id}",method=RequestMethod.GET)
//	public Order getOrderById(@PathVariable Long id){
//		//log.debug("Loading order by id");
//		return orderService.getOrder(id);
//	}
//	
//	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
//	public void deleteOrderById(@PathVariable Long id){
//		orderService.deleteOrder(id);
//	}
//	
//	@RequestMapping(value="/{id}/items", method=RequestMethod.GET)
//	public List<Item> itemsForOder(@PathVariable Long id){
//		return itemService.getItemsForOrder(id);
//	}
}