package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.City;
import com.example.demo.model.CityFields;
import com.example.demo.model.GeoShape;
import com.example.demo.model.Geometry;
import com.example.demo.model.OtherTags;
import com.example.demo.service.CityRepository;

@SpringBootApplication
public class RestdemoApplication implements CommandLineRunner{
	@Autowired
	private CityRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(RestdemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		repository.deleteAll();
		double[] c ={2.2944968, 48.8581328};
		double[] c2 = {2.2944968, 48.8581328};
		double[] c3 = {48.8581328, 2.2944968};
		Geometry geometry = new Geometry("Point", c );
		GeoShape geoShape = new GeoShape("Point", c2);
		OtherTags otherTags = new OtherTags("french", "Le Jules Verne", "2", 
				"http://www.lejulesverne-paris.com", "75001", "Tour Eiffel",
				"Avenue Gustave Effel");
		CityFields fields = new CityFields("http://www.louvre.fr","monument",
				"2014-10-23T08:42:44+02:00", "yes", "2\u00e8me \u00e9tage", 
				"althio",otherTags,c3,geoShape);
		City paris = new City("points-dinterets-openstreetmap-en-france",
				"21b3822ea07ea5874acbc95a97dbb44fc1fb7ba7",fields,geometry );
		paris.setName("paris");
		repository.save(paris);
		System.out.println(repository.findAll().get(0));
	
		
	}
}
