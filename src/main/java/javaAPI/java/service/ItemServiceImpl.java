package javaAPI.java.service;

import lombok.extern.log4j.Log4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("itemService")
@Log4j
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	//private ItemRepository itemRepo;
	
	@Transactional
	public boolean getItems()
	{
		//log.debug("Getting pending items");
		//Page<Item> results = itemRepo.findAll(pageable);
		return true;
	}
	
	@Transactional
	public boolean getItemsForOrder() {
		return true;
	}

}
