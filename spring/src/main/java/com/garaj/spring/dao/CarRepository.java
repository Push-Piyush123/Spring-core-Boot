package com.garaj.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.garaj.spring.entities.*;
@Repository
public interface CarRepository extends JpaRepository<Car,Long>{

}
