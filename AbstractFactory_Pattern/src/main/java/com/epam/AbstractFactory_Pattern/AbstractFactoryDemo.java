package com.epam.AbstractFactory_Pattern;

public class AbstractFactoryDemo {
	   public static void main(String[] args) {
	      PatternAbstractFactory sf = Pro.getFactory(false);
	      Shape s1 = sf.getShape("RECTANGLE");
	      s1.draw();
	      Shape s2 = sf.getShape("SQUARE");
	      s2.draw();
	      PatternAbstractFactory sf1 = Pro.getFactory(true);
	      Shape s3 = sf1.getShape("RECTANGLE");
	      s3.draw();
	      Shape s4 = sf1.getShape("SQUARE");
	      s4.draw();
	      
	   }
	}