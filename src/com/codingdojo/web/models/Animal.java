package com.codingdojo.web.models;

public class Animal {
	private String name;
	private String breed;
	private int weight;
	
//	constructors
	public Animal() {
		
	}
	public Animal(String name, String breed, int weight) {
		this.setName(name);
		this.setBreed(breed);
		this.setWeight(weight);
	}
// getter and setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
