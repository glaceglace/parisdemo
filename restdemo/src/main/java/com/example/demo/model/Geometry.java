package com.example.demo.model;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class Geometry {
	private String type;
	private double[] coordinates;
	public Geometry(String type, double[] coordinates) {
		super();
		this.type = type;
		this.coordinates = coordinates;
	}
	
	public Geometry() {
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
		return "Geometry [type=" + type + ", coordinates=" + Arrays.toString(coordinates) + "]";
	}

	

}
