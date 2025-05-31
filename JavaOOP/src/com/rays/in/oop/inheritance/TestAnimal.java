package com.rays.in.oop.inheritance;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		
		a.setBark("Dog");
		a.setEat("Grass");
		a.setColor("White");
		a.setHabit("Sleeping");
		d.setBreeds("GermanSheephard");
		d.setBark("Bhoo-Bhoo");
		d.setColor("Black");
		
		
	System.out.println("The animal who bark " +a.getBark());
	System.out.println("The animal who eat "+a.getEat());
	System.out.println("the animal whose color is :" +a.getColor());
	System.out.println("the animal habit s :" +a.gethabit());
	System.out.println("The animal name" + d.getBreeds());
	}
		
	}
	