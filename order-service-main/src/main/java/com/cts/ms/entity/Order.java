package com.cts.ms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Order_Tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@Id
	private Integer id;
	private String name;
	private int qty;
	private double price;

}
