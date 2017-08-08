//package javaAPI.java.service;
//
//import java.util.List;
//
//import lombok.extern.log4j.Log4j;
//import javaAPI.java.domain.Item;
//import javaAPI.java.test.BaseTest;
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.test.context.ContextConfiguration;
//
//import static org.junit.Assert.*;
//
//@Log4j
//@ContextConfiguration("/applicationContext.xml")
//public class ItemServiceImplTest extends BaseTest{
//	
//	@Autowired ItemService itemService;
//	
//	//@Test
//	public void testGetItems() {
//		//log.debug("Testing Get Items Service");
//		//List<Item> items = itemService.getItems(new PageRequest(0, 5));
//		equals(true);
//		
////		items = itemService.getItems(new PageRequest(0, 2));
////		assertEquals(2, items.size());
//	}
//	
//	//@Test
//	public void testGetOrderItems(){
//		//log.debug("Testing get items for order");
//		List<Item> items = itemService.getItemsForOrder(new Long(1));
//		//log.debug(items);
//		assertEquals(4, items.size());
//	}
//
//}
