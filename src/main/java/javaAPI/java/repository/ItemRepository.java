package javaAPI.java.repository;

import java.util.List;
import javaAPI.java.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//public interface ItemRepository extends JpaRepository<Item, Long> {
//
//	@Query("select items from Order o inner join o.items as items where o.id = ?1")
//	List<Item> getOrderItems(Long orderId);
//}