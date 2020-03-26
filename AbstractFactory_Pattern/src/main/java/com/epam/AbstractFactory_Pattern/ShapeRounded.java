package com.epam.AbstractFactory_Pattern;


public class ShapeRounded extends PatternAbstractFactory {
	   public Shape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new RectRounded();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new SquareRounded();
	      }	 
	      return null;
	   }
	}