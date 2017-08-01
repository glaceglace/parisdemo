package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.service.CityRepository;

@RestController
public class CityController {
	@Autowired
	CityRepository repository;
	@GetMapping(value = "/paris")
	public City getParis(){
		return repository.findByName("paris");
	}
}
