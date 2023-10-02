package com.hacom.repositories;
import com.hacom.comapi.entities.Alert;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlertRepository extends MongoRepository<Alert, String> {

	List<Alert> findAll();
    
}