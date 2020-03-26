package com.epam.Prototype_Pattern;


class Prototype 
{ 
    public static void main (String[] args) 
    { 
        FoodType.getFood("Biryani").addFood();
        FoodType.getFood("Biryani").addFood();
        FoodType.getFood("Burger").addFood();
    } 
}