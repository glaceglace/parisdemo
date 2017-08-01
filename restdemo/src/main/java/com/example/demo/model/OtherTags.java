package com.example.demo.model;

public class OtherTags {
	@Override
	public String toString() {
		return "OtherTags [musee=" + musee + ", name=" + name + ", level=" + level + ", source=" + source
				+ ", addr_postcode=" + addr_postcode + ", addr_housename=" + addr_housename + ", addr_street="
				+ addr_street + "]";
	}

	private String musee, name, level, source, 
					addr_postcode, addr_housename,
					addr_street;

	public OtherTags(String musee, String name, String level, String source, String addr_postcode,
			String addr_housename, String addr_street) {
		super();
		this.musee = musee;
		this.name = name;
		this.level = level;
		this.source = source;
		this.addr_postcode = addr_postcode;
		this.addr_housename = addr_housename;
		this.addr_street = addr_street;
	}
	public OtherTags() {
		super();
		this.musee = "";
		this.name = "";
		this.level = "";
		this.source = "";
		this.addr_postcode = "";
		this.addr_housename = "";
		this.addr_street = "";
	}

	public String getMusee() {
		return musee;
	}

	public String getName() {
		return name;
	}

	public String getLevel() {
		return level;
	}

	public String getSource() {
		return source;
	}

	public String getAddr_postcode() {
		return addr_postcode;
	}

	public String getAddr_housename() {
		return addr_housename;
	}

	public String getAddr_street() {
		return addr_street;
	}

	public void setMusee(String musee) {
		this.musee = musee;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setAddr_postcode(String addr_postcode) {
		this.addr_postcode = addr_postcode;
	}

	public void setAddr_housename(String addr_housename) {
		this.addr_housename = addr_housename;
	}

	public void setAddr_street(String addr_street) {
		this.addr_street = addr_street;
	}
		

}
