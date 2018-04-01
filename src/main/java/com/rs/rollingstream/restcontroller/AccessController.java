package com.rs.rollingstream.restcontroller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rs.rollingstream.dao.interfaces.CarRepository;
import com.rs.rollingstream.model.Car;

@RestController
public class AccessController {
	
	 private CarRepository repository;
	 
	    public AccessController(CarRepository repository) {
	        this.repository = repository;
	    }
	    @GetMapping("/first-test")
	    public Collection<Car> coolCars() {
	        return repository.findAll().stream()
	                .filter(this::isCool)
	                .collect(Collectors.toList());
	    }
	    
	    private boolean isCool(Car car) {
	        return !car.getName().equals("AMC Gremlin") &&
	                !car.getName().equals("Triumph Stag") &&
	                !car.getName().equals("Ford Pinto") &&
	                !car.getName().equals("Yugo GV");
	    }
	    
	 

}
