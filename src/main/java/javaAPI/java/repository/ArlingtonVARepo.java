package javaAPI.java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javaAPI.java.domain.ArlingtonVA;
import javaAPI.java.domain.Item;

public interface ArlingtonVARepo extends JpaRepository<ArlingtonVA, Long> {

	@Query("select * from ArlingtonVA")
	List<ArlingtonVA> getOrderItems();

}
