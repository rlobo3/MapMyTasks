package com.TaskList;

public class Location {
	private String address;
	private String city;
	private String state;
	private long zip;
	
	public Location(String address, String city, String state, long zip) {
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public Location(String address, String city, long zip) {
		this(address, city, null, zip);
	}
	
	public Location(String address, long zip, String state) {
		this(address, null, state, zip);
	}
	
	public Location(String address, long zip) {
		this(address, null, null, zip);
	}
	
	public Location() {
		this(null, null, null, 0);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}
}
