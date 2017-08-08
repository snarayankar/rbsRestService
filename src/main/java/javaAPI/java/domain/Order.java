package javaAPI.java.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name="ORDERTABLE")
@Data
//@JsonIgnoreProperties(ignoreUnknown=true)
public class Order implements Serializable{
	
	private static final long serialVersionUID = -1103863992260274071L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	private String name;
	
	@ManyToMany
	@JoinTable(name="ORDER_ITEM")	
	private List<Item> items = new ArrayList<Item>();
	
	@CreatedBy	
	private Long createdBy;
	
	@CreatedDate
	private DateTime createdDate;
	
	@LastModifiedBy
	private Long lastModifiedBy;
	
	@LastModifiedDate	
	private DateTime lastModifiedDate;
	
	public void addItem(Item i){
		this.items.add(i);
	}
}
