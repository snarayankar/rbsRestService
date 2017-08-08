package javaAPI.java.web;

import java.util.Collection;

import lombok.extern.log4j.Log4j;

import javaAPI.java.domain.Item;
import javaAPI.java.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Log4j
@RestController
@RequestMapping("/items")
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Item> getItems(@PageableDefault(page = 0, value = 5)Pageable pageable){
		//log.debug("Loading all items");
		return itemService.getItems(pageable);
	}
}
