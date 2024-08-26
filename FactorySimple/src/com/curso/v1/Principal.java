package com.curso.v1;

import com.curso.pizza.*;

public class Principal {
	 
	public static void main(String[] args) {
		System.out.println("V1");
		Pizza pizza;
		
		TiendaPizza tienda = new TiendaPizza();

		pizza = tienda.orderPizza("queso");
		
		System.out.println("Ordené una pizza " + pizza.getName() + "\n");
		System.out.println(pizza);
		System.out.println("*************************");
		
		pizza = tienda.orderPizza("peperoni");
		
		System.out.println("Ordené una pizza " + pizza.getName() + "\n");
		System.out.println(pizza);
		
		System.out.println("*************************");
		
		pizza = tienda.orderPizza("almeja");
		
		System.out.println("Ordené una pizza " + pizza.getName() + "\n");
		System.out.println(pizza);

	}
}