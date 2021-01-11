package com.qa.main;


//Create a Person class modelling name, age and job title variables.
//
//Create a method to return all three of these in a formatted string.
//
//HINT: @Override the toString() method.
//
//Create some example objects with this class.
//
//Create a List<> implementation and store those objects inside.
//
//HINT: it's probably best to put your List<> implementation in a separate class.
//
//Create a method that can search for a specific Person by their name.
//
//Use a stream to output all of your people to the console.
//
//HINT: you can iterate through collections using streams with forEach().

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	
	public String setName(String name) {
		this.name = name;
		
		return name;
		
	}
	
	
	public String getName() {
		return name;
	}




	public int setAge (int age) {
		this.age=age;
		
		return age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String setJobTitle (String jobTitle) {
		this.jobTitle=jobTitle;
		
		return jobTitle;
		
	}
	
	public String getJobTitle () {
		return jobTitle;
	}
	
	public Person(String name, int age, String jobTitle) {
		this.name=name;
		this.age=age;
		this.jobTitle=jobTitle;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}
	
	
	
	

}
