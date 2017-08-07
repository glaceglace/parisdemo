package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.ViewPoint;

@Component
public class ViewPointService {
	@Autowired
	private ViewPointRepository repository;
	@Transactional
	public void insertTwoDummy(){
		ViewPoint v1 = new ViewPoint();
		v1.setCityname("lemans");
		ViewPoint v2 = new ViewPoint();
		v2.setCityname("paris");
		repository.save(v1);
		if(v1.getCityname().equals("lemans")){
		return;
		}
		repository.save(v2);
		
	}

}
