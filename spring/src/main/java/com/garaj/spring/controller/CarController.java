package com.garaj.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.garaj.spring.entities.Car;
import com.garaj.spring.service.ServiceImpl;

@RestController
public class CarController {
	
	@Autowired
	private ServiceImpl carservice;
	@GetMapping("/home")
	public String getHome() {
		System.out.println("hsdjwksk");
		return "hello";

	}
	
	@PostMapping("/car")
	public ResponseEntity<Car> addCar(@RequestBody Car car) {

	    Car add = carservice.addCar(car);

	    return ResponseEntity
	            .status(HttpStatus.CREATED)
	            .body(add);
	}
	
	@GetMapping("/car")
	public List<Car> getallcar(){
		return carservice.getAllCar();
	}

}
