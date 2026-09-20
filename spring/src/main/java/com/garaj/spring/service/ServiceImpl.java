package com.garaj.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garaj.spring.dao.CarRepository;
import com.garaj.spring.entities.Car;

@Service
public class ServiceImpl implements CarService {
	
	@Autowired
	private CarRepository repository;
	@Override
	public Car addCar(Car car) {
		// TODO Auto-generated method stub
		return repository.save(car);
	}

	@Override
	public Car getCar(long id) {
		// TODO Auto-generated method stub
		Optional<Car>getcar=repository.findById(id);
		
		if(getcar.isPresent()) {
			return getcar.get();
		}
		return null;
	}

	@Override
	public List<Car> getAllCar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
