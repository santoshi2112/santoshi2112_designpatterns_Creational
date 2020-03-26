package com.epam.Builder_pattern;


public abstract class Drink implements ItemType {

	@Override
	public Packing packing() {
     return new Bottle();
	}

	@Override
	public abstract float price();
}