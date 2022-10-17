package com.spring;

public class Collage {
	private String cName;
	private String place;
	private Address address;
	
	public Collage() {
		super();
	}
	public Collage(Address address) {
		this.address=address;
		
	}
	public Collage(String cName, String place, Address address) {
		super();
		this.cName = cName;
		this.place = place;
		this.address = address;
	}
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void printClg() {
		System.out.println("Collage details:");
		System.out.println("collage name: "+cName);
		System.out.println("Collage District:"+place);
		System.out.println("City Address:"+getAddress().getCity());
		
		
	}
}
