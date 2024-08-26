package com.curso.v2;

import com.curso.pizza.*;

public class Principal {
	 
	public static void main(String[] args) {
		System.out.println("V2");
		Pizza pizza;
		
		TiendaPizza tienda = new TiendaPizza();

		pizza = tienda.orderPizza(TipoPizza.QUESO);
		
		System.out.println("Ordené una pizza " + pizza.getName() + "\n");
		System.out.println(pizza);
		System.out.println("*************************");
		
		pizza = tienda.orderPizza(TipoPizza.ALMEJA);
		
		System.out.println("Ordené una pizza " + pizza.getName() + "\n");
		System.out.println(pizza);
		
		System.out.println("*************************");
		
		pizza = tienda.orderPizza(TipoPizza.PEPERONI);
		
		System.out.println("Ordené una pizza " + pizza.getName() + "\n");
		System.out.println(pizza);

	}
}