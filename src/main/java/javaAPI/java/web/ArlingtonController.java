package javaAPI.java.web;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javaAPI.java.service.ArlingtonVaService;
import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@RequestMapping("/arlington")
public class ArlingtonController {
	
	@Autowired
	ArlingtonVaService arlingtonVAService;
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public boolean getItems(@PageableDefault(page = 0, value = 5)Pageable pageable){
		//log.debug("Loading all items");
		return arlingtonVAService.getItems();
	}
}