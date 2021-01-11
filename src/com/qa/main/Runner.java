package com.qa.main;



public class Runner {
	public static void main(String[] args) {
		
		Person p1 = new Person ("Arsalan", 24, "Software Developer");
		Person p2 = new Person ("Nick", 26, "Teach");
		Person p3 = new Person ("Luna", 22, "Wizard");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		
		ListData ld = new ListData();
		ld.people.add(p1);
		ld.people.add(p2);
		ld.people.add(p3);
		System.out.println(ld.people);
		
		System.out.println(ld.findByName("Nick"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
