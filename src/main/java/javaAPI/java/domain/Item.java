package javaAPI.java.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Item implements Serializable{
	
	private static final long serialVersionUID = 4630234518328168345L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	private String description;
	
	private float price;
	
	@JsonIgnore
	@CreatedDate
	public Date createDate;
	
	@JsonIgnore
	@LastModifiedDate
	public Date lastModified;

}
