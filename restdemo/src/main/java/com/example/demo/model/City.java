package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cities")
public class City {
	@Id
	private String datasetid;
	private String name;
	private String recordid;
	private CityFields fields;
	private Geometry geometry;
	
	
	public City(String datasetid, String recordid, CityFields fields, Geometry geometry) {
		this.datasetid = datasetid;
		this.recordid = recordid;
		this.fields = fields;
		this.geometry = geometry;
	}
	public City() {
		this.datasetid = "";
		this.recordid = "";
		this.fields = null;
		this.geometry = null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDatasetid() {
		return datasetid;
	}
	public String getRecordid() {
		return recordid;
	}
	public CityFields getFields() {
		return fields;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setDatasetid(String datasetid) {
		this.datasetid = datasetid;
	}
	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}
	public void setFields(CityFields fields) {
		this.fields = fields;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	@Override
	public String toString() {
		return "City [datasetid=" + datasetid + ", name=" + name + ", recordid=" + recordid + ", fields=" + fields
				+ ", geometry=" + geometry + "]";
	}

}
