package com.example.demo.model;

import java.util.Arrays;

public class GeoShape {
	private String type;
	private double[] coordinates;
	public GeoShape(String type, double[] coordinates) {
		super();
		this.type = type;
		this.coordinates = coordinates;
	}
	public GeoShape() {
		this.type = "";
		this.coordinates = null;
	}
	public String getType() {
		return type;
	}
	public double[] getCoordinates() {
		return coordinates;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCoordinates(double[] coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		return "GeoShape [type=" + type + ", coordinates=" + Arrays.toString(coordinates) + "]";
	}
	

}
