package com.spring;

public class University {
	private String name;
	private Collage collage;
	
	public University() {
		super();
	}
	public University(Collage collage) {
		this.collage=collage;
	}
	public University(String name, Collage collage) {
		super();
		this.name = name;
		this.collage = collage;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collage getCollage() {
		return collage;
	}
	public void setCollage(Collage collage) {
		this.collage = collage;
	}
	
	public void display() {
		System.out.println("university details: ");
		System.out.println("University name: "+name);
		getCollage().printClg();
		
	}
}
