package com.epam.Prototype_Pattern;

import java.util.HashMap;
import java.util.Map;
public class FoodType{ 
		   
	    private static Map<String, Food> FoodMap = new HashMap<String, Food>();  
	       
	    static 
	    { 
	        FoodMap.put("Biryani", new Biryani()); 
	        FoodMap.put("Burger", new Burger()); 
	    } 
	       
	    public static Food getFood(String FoodName) 
	    { 
	        return(Food)FoodMap.get(FoodName).clone(); 
	    } 
	} 