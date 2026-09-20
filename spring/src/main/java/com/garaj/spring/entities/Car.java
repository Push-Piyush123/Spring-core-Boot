package com.garaj.spring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
	
	@Id
	private long id;
	private String name;
	private String color;
	private String brand;
	private double price;
	
	public Car(long id, String name, String color, String brand, double price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", color=" + color + ", brand=" + brand + ", price=" + price + "]";
	}
	
	

}
