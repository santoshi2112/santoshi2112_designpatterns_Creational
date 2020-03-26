package com.epam.Factory_Pattern;

public class DemoFactory {

	   public static void main(String[] args) {
	      demoShape sd = new demoShape();
	      Shapes s1 = sd.getShape("SQUARE");
	      s1.sketch();
	      Shapes s2 = sd.getShape("RECTANGLE");
	      s2.sketch();
	   }
	}