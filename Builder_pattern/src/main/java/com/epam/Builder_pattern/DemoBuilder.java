package com.epam.Builder_pattern;

public class DemoBuilder {
	   public static void main(String[] args) {
	   
	      Brunch1 b = new Brunch1();

	      Brunch vegMeal = b.VegMeal();
	      System.out.println("Veg Meal");
	      vegMeal.showItems();
	      System.out.println("Total Cost: " + vegMeal.getCost());

	}
	}