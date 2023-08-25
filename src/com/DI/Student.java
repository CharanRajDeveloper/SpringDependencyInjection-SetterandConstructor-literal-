package com.DI;

public class Student {
	private int id;
	private String name;

	/*
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 */
	
	public void displayInfo() {
		System.out.println("Name: " + name + " and ID:" + id);
	}

	public Student(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
