package com.example.demo.service;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.ViewPoint;

public interface ViewPointRepository extends MongoRepository<ViewPoint, String> {
	List<ViewPoint> findByCityname(String name);
	List<ViewPoint> findByDatasetid(String id);
	@Query(value = "{'cityname' : ?0, 'fields.otherTags.name' : ?1}")
	List<ViewPoint> findByCitynameAndFieldsOtherTagsName(String cityname, String name);
}
