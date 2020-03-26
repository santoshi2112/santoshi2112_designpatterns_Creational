package com.epam.AbstractFactory_Pattern;

public class Pro {
	   public static PatternAbstractFactory getFactory(boolean rounded){   
	      if(rounded){
	         return new ShapeRounded();         
	      }else{
	         return new FactoryShape();
	      }
	   }
	}