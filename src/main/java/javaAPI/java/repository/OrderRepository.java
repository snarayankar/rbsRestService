package javaAPI.java.repository;

import java.util.List;

import javaAPI.java.domain.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * A sample repository with different approaches for defining custom queries.
 * 
 * Want to review the full documentation?
 * 
 * http://docs.spring.io/spring-data/data-jpa/docs/1.6.0.RELEASE/reference/html/
 * jpa.repositories.html
 * 
 * @author ahisley
 *
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

//	@Query("select distinct o from Order o left join fetch o.items where o.name = ?1")
//	public List<Order> findOrdersByName(String name);
//
//	@Query("select o from Order o left join fetch o.items where o.id = ?1")
//	public Order findOne(Long id);

}
