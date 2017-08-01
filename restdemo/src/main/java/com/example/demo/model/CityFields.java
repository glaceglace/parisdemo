package com.example.demo.model;

import java.util.Arrays;

public class CityFields {
	@Override
	public String toString() {
		return "CityFields [website=" + website + ", amenity=" + amenity + ", timestamp=" + timestamp + ", wheelchair="
				+ wheelchair + ", note=" + note + ", user=" + user + ", otherTags=" + otherTags + ", geo_point_2d="
				+ Arrays.toString(geo_point_2d) + ", geo_shape=" + geo_shape + "]";
	}
	private String website, amenity, timestamp, wheelchair,
					note, user;
	private OtherTags otherTags;
	private double[] geo_point_2d;
	private GeoShape geo_shape;
	public CityFields(String website, String amenity, String timestamp, String wheelchair, String note, String user,
			OtherTags otherTags, double[] geo_point_2d, GeoShape geo_shape) {
		super();
		this.website = website;
		this.amenity = amenity;
		this.timestamp = timestamp;
		this.wheelchair = wheelchair;
		this.note = note;
		this.user = user;
		this.otherTags = otherTags;
		this.geo_point_2d = geo_point_2d;
		this.geo_shape = geo_shape;
	}
	public CityFields() {
		this.website = "";
		this.amenity = "";
		this.timestamp = "";
		this.wheelchair = "";
		this.note = "";
		this.user = "";
		this.otherTags = null;
		this.geo_point_2d = null;
		this.geo_shape = null;
	}
	public String getWebsite() {
		return website;
	}
	public String getAmenity() {
		return amenity;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public String getWheelchair() {
		return wheelchair;
	}
	public String getNote() {
		return note;
	}
	public String getUser() {
		return user;
	}
	public OtherTags getOtherTags() {
		return otherTags;
	}
	public double[] getGeo_point_2d() {
		return geo_point_2d;
	}
	public GeoShape getGeo_shape() {
		return geo_shape;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public void setAmenity(String amenity) {
		this.amenity = amenity;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public void setWheelchair(String wheelchair) {
		this.wheelchair = wheelchair;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setOtherTags(OtherTags otherTags) {
		this.otherTags = otherTags;
	}
	public void setGeo_point_2d(double[] geo_point_2d) {
		this.geo_point_2d = geo_point_2d;
	}
	public void setGeo_shape(GeoShape geo_shape) {
		this.geo_shape = geo_shape;
	}

}
