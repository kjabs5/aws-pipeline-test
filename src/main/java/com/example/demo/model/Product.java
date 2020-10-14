package com.example.demo.model;

import javax.persistence.Entity;

import lombok.Data;


public class Product {
    
	
	private Integer id;
	private String pname;
	private double price;
	
	
	
	public Product() {
		super();
	}

	public Product(Integer id, String pname, double price) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
	
}
