package javaAPI.java.service;

import java.util.List;

import javaAPI.java.domain.Item;
import javaAPI.java.repository.ItemRepository;
import lombok.extern.log4j.Log4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("itemService")
@Log4j
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository itemRepo;
	
	@Transactional
	public List<Item> getItems(Pageable pageable) 
	{
		//log.debug("Getting pending items");
		Page<Item> results = itemRepo.findAll(pageable);
		return results.getContent();
	}
	
	@Transactional
	public List<Item> getItemsForOrder(Long orderId) {
		return itemRepo.getOrderItems(orderId);
	}

}
