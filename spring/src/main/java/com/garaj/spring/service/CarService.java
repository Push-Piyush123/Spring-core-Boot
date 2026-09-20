package com.garaj.spring.service;

import java.util.List;

import com.garaj.spring.entities.Car;

public interface CarService {
	
	public Car addCar(Car car);
	
	public Car getCar(long id);
	
	public List<Car> getAllCar();
	
}
