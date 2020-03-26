package com.epam.Singleton_Pattern;


public class Singleton {
	   private static Singleton s = new Singleton();
	   private Singleton(){}
	   public static Singleton getInstance(){
	      return s;
	   }

	   public void show(){
	      System.out.println("demo of singleton pattern type");
	   }
	}