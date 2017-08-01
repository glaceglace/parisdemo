package com.example.demo.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.City;

public interface CityRepository extends MongoRepository<City, String> {
	City findByName(String name);
}
