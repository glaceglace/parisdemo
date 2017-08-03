package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
@Document(collection = "cities")
public class ViewPoint {
	@Autowired
	Geometry geometry_bean;
	@Autowired
	Fields fields_bean;
	@Id
	private String datasetid;
	private String cityname;
	private String recordid;
	private Fields fields;
	private Geometry geometry;
	
	
	public ViewPoint(String datasetid, String recordid) {
		this.datasetid = datasetid;
		this.recordid = recordid;
		this.fields = fields_bean;
		this.geometry = geometry_bean;
	}
	public ViewPoint() {
	}
	public String getName() {
		return cityname;
	}
	public String getDatasetid() {
		return datasetid;
	}
	public String getRecordid() {
		return recordid;
	}
	public Fields getFields() {
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
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public void setFields(Fields fields) {
		this.fields = fields;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	@Override
	public String toString() {
		return "ViewPoint [datasetid=" + datasetid + ", cityname=" + cityname + ", recordid=" + recordid + ", fields="
				+ fields + ", geometry=" + geometry + "]";
	}


}
