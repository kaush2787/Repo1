package com.balazsholczer.decorator;

public abstract class PizzaDecorator implements Pizza {
	
	private Pizza pizza;
	
	public PizzaDecorator(Pizza pizza){
		this.pizza = pizza;
	}

	@Override
	public int getCost() {
		return this.pizza.getCost();
	}
	
	@Override
	public String getDescription() {
		return this.pizza.getDescription();
	}
}
