package com.epam.Prototype_Pattern;


class Burger extends Food{ 
 
  public Burger() 
  { 
      this.FoodName = "Burger"; 
  } 
 
  @Override
  void addFood()  
  { 
      System.out.println("Burger added"); 
  } 
} 