package com.epam.Prototype_Pattern;


class Biryani extends Food
{ 
  public Biryani()  
  { 
      this.FoodName = "biryani"; 
  } 
 
  @Override
  void addFood()  
  { 
      System.out.println("Biryani added"); 
  } 
    
} 