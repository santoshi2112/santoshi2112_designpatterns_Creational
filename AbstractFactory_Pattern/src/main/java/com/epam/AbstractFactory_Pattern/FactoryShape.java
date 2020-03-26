package com.epam.AbstractFactory_Pattern;


public class FactoryShape extends PatternAbstractFactory {
	   public Shape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rect();  
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Sqr();
	      }	 
	      return null;
	   }
	}