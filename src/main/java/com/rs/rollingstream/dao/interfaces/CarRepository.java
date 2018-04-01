package com.rs.rollingstream.dao.interfaces;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.rs.rollingstream.model.*;


@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {
	
}
