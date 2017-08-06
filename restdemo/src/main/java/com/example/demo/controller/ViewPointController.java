package com.example.demo.controller;


import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Fields;
import com.example.demo.model.GeoShape;
import com.example.demo.model.Geometry;
import com.example.demo.model.OtherTags;
import com.example.demo.model.Result;
import com.example.demo.model.ViewPoint;
import com.example.demo.service.ViewPointRepository;
import com.example.demo.utils.ResultUtil;

import ch.qos.logback.core.Context;
import groovy.lang.MetaClassImpl.Index;
import scala.annotation.meta.field;

@RestController("/api")
public class ViewPointController {
	private final static Logger logger = LoggerFactory.getLogger(ViewPointController.class);
	
	@Autowired
	ViewPointRepository repository;
	@Autowired
	OtherTags otherTags;
	@Autowired
	Fields field;
	
	/**
	 * Get un viewpoint
	 * @param name
	 * @return
	 */
	@GetMapping(value = "/city")
	public List<ViewPoint> getCity(@RequestParam(value = "name", required = false, defaultValue = "paris") String name){
		return repository.findByCityname(name);
	}
	/**
	 * Get un viewpoint en precisant le nom de la ville
	 * et le nom de viewpoint
	 * @param cityname
	 * @param viewpointname
	 * @return
	 */
	@GetMapping("/cityandvp")
	public List<ViewPoint> getViewPointByCityAndViewName(
				@RequestParam(value = "cityname")
				String cityname, 
				@RequestParam(value = "viewpointname")
				String viewpointname){
		return repository.findByCitynameAndFieldsOtherTagsName(
							cityname,viewpointname);
	}
	/**
	 * Ajouter un viewpoint
	 * @param cityname
	 * @param name
	 * @param vPoint
	 * @param otherTags
	 * @param fields
	 * @return
	 */
	@PostMapping(value= "/{cityname}")
	public Result<ViewPoint> postViewPoint(@PathVariable("cityname") String cityname, 
			@RequestParam(value = "name") String name, ViewPoint vPoint, OtherTags otherTags, Fields fields){
		System.out.println(name);
		otherTags.setName(name);
		fields.setOtherTags(otherTags);
		vPoint.setFields(fields);
		System.out.println(vPoint);
		return  ResultUtil.success(repository.save(vPoint));
	}
	@PostMapping(value = "/dummy/{cityname}")
	public Object postDummyViewPoint(@PathVariable("cityname") String cityname,
										@RequestParam(value = "viewname") String viewname,
										ViewPoint vPoint, OtherTags otherTags, Fields fields, 
										Geometry geometry, GeoShape geoShape){
		double[] c ={2.2944968, 48.8581328};
		double[] c2 = {2.2944968, 48.8581328};
		double[] c3 = {48.8581328, 2.2944968};
		geometry.setType("Point");
		geometry.setCoordinates(c);
		geoShape.setType("Point");
		geoShape.setCoordinates(c2);
		otherTags.setMusee("french");
		otherTags.setName(viewname);
		otherTags.setLevel("2");
		otherTags.setSource("http://www.lejulesverne-paris.com");
		otherTags.setAddr_postcode("75001");
		otherTags.setAddr_housename(viewname);
		fields.setWebsite("http://www.louvre.fr");
		fields.setAmenity("monument");
		fields.setTimestamp("2014-10-23T08:42:44+02:00");
		fields.setWheelchair("yes");
		fields.setNote("2\u00e8me \u00e9tage");
		fields.setUser("althio");
		fields.setOtherTags(otherTags);
		fields.setGeo_shape(geoShape);
		fields.setGeo_point_2d(c3);
		vPoint.setCityname(cityname);
		vPoint.setFields(fields);
		vPoint.setGeometry(geometry);		
		repository.save(vPoint);
		System.out.println(repository.findAll().get(0));
		return vPoint;
	}
	
	/**
	 * Modifier le postcode d'un viewpoint
	 * @param id
	 * @param postcode
	 * @return
	 */
	@PutMapping
	public Object putViewPoint(@RequestParam(value = "id") String id,
								@RequestParam(value = "postcode") String postcode){
		ViewPoint vPoint = repository.findByDatasetid(id);
		vPoint.getFields().getOtherTags().setAddr_postcode(postcode);
		repository.save(vPoint);
		return vPoint;
	}
	
	/**
	 * supprimer un viewpoint par son ID
	 * @param id
	 */
	@DeleteMapping
	public void deleteViewPoint(@RequestParam(value = "id") String id){
		repository.delete(id);
	}
	
}
