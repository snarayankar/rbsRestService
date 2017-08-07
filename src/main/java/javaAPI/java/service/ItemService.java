package javaAPI.java.service;

import java.util.List;

import javaAPI.java.domain.Item;

import org.springframework.data.domain.Pageable;

public interface ItemService {

	List<Item> getItems(Pageable page);
	List<Item> getItemsForOrder(Long orderId);
}