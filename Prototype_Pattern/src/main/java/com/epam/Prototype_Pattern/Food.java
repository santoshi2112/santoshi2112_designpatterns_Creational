package com.epam.Prototype_Pattern;

abstract class Food implements Cloneable 
{ 
     
   protected String FoodName; 
      
   abstract void addFood(); 
      
   public Object clone() 
   { 
       Object clone = null; 
       try 
       { 
           clone = super.clone(); 
       }  
       catch (CloneNotSupportedException e)  
       { 
           e.printStackTrace(); 
       } 
       return clone; 
   } 
} 