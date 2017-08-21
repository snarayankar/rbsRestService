package javaAPI.java.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

import org.joda.time.LocalDateTime;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@EntityScan
@EnableJpaRepositories
@Table(name="ArlingtonVA")
@Data
public class ArlingtonVA implements Serializable {

	@Id
	@Column(name="RestaurantName")
	private String restaurantName;
	
	@Column(name="InspectionDate")
	private LocalDateTime inspectionDate;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Observation1")
	private String observation1;
	
	@Column(name="Observation2")
	private String observation2;
	
	@Column(name="Observation3")
	private String observation3;
	
	@Column(name="Observation4")
	private String observation4;
}

