package com.jay.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table
public class Product {
	
	@Id
	@GeneratedValue
	private Integer pid;
	
	@NotBlank(message="Name is mandatory")
	@Size(min=3, max=15, message="Minimum 3 to 15 characters")
	private String name;
	
	@NotNull(message= "Price is mandatory")
	private Double price;
	
	@NotNull(message="quantity is mandatory")
	private Integer qty;

}
