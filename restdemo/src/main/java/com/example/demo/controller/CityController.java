package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.service.CityRepository;

@RestController
public class CityController {
	@Autowired
	CityRepository repository;
	@GetMapping(value = "/{name}")
	public City getParis(@PathVariable("name") String name){
		return repository.findByName(name);
	}
	@GetMapping(value = "/city")
	public City getCity(@RequestParam(value = "name", required = false, defaultValue = "paris") String name){
		return repository.findByName(name);
	}
}
