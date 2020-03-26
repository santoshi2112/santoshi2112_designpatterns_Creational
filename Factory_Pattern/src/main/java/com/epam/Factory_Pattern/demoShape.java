package com.epam.Factory_Pattern;

public class demoShape { 
	   public Shapes getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new SQUARE();
	         
	      }
	      else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new RECT();
	         
	      }
	      
	      return null;
	   }
	}