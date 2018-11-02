package com.codingdojo.web.models;

public class Cat extends Animal implements Pet{
	
	public Cat (String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	public String showAffection() {
		return "This "+ this.getWeight() +"lb "+this.getBreed()+" cat, "+this.getName()+", is purring at you!";
	}
}
