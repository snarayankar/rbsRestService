package javaAPI.java.service;

import static org.junit.Assert.*;

import java.util.List;

import lombok.extern.log4j.Log4j;

import org.aamc.commons.spring.security.AamcUserDetails;
import javaAPI.java.domain.Item;
import javaAPI.java.domain.Order;
import javaAPI.java.test.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;

@Log4j
public class OrderServiceImplTest extends BaseTest{
	
	@Autowired OrderService orderService;
	@Autowired ItemService itemService;
	
	private List<Item> items;
	
	@Before
	public void before(){
		items = itemService.getItems(new PageRequest(0, 10));
		AamcUserDetails ud = new AamcUserDetails("jswann", "12345");
		TestingAuthenticationToken testingToken = new TestingAuthenticationToken(ud, null);
		SecurityContextHolder.getContext().setAuthentication(testingToken);		
	}
	
	@Test
	public void testGetOrder() {
		log.debug("Testing getOrder");
		Order order = orderService.getOrder(1L);
		assertEquals(new Long(1), order.getId());
		assertEquals(4, order.getItems().size());
		log.debug(order);
		
		order = orderService.getOrder(2L);
		log.debug(order);
		assertEquals(new Long(2), order.getId());
		assertEquals(0, order.getItems().size());
	}

	@Test
	public void testSearchOrders() {
		log.debug("Finding Orders by Name");
		List<Order> orders = orderService.findOrdersByName("Swann");
		assertEquals(1, orders.size());
		Order o = orders.get(0);
		assertEquals(4, o.getItems().size());
	}

	@Test
	public void testSaveOrder() {
		log.debug("Saving Order");
		Order o = new Order();
		o.setName("Jim");
		o.addItem(items.get(0));
		o.addItem(items.get(3));
		o.addItem(items.get(2));
		assertEquals(3, o.getItems().size());
		
		orderService.createOrder(o);
		Long orderId = o.getId();
		log.debug("Saved Order: "+orderId);		
		getEntityManager().detach(o);
		o = orderService.getOrder(orderId);
		assertEquals(orderId, o.getId());
		log.debug(o);
	}

	@Test
	public void testDeleteOrder() {
		log.debug("Deleting Order");		
		orderService.deleteOrder(1L);
		getEntityManager().flush();
		
		Order o = orderService.getOrder(1L);
		assertNull(o);
		
		List<Order> orders = orderService.getOrders(new PageRequest(0, 10));
		assertEquals(2, orders.size());
	}

}