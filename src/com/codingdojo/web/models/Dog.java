package com.codingdojo.web.models;

public class Dog extends Animal implements Pet{
	
	public Dog (String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	public String showAffection() {
		int weight = getWeight();
		if(weight<15) {
			return "This small "+ this.getWeight() +"lb "+this.getBreed()+" dog, "+this.getName()+", is wagging tail!";
		} else if (weight>25) {
			return "This big "+ this.getWeight() +"lb "+this.getBreed()+" dog, "+this.getName()+", is smiling at you!";
		} else {
			return "This mid-size "+ this.getWeight() +"lb "+this.getBreed()+" dog, "+this.getName()+", is jumping on you!";

		}
	}
}
