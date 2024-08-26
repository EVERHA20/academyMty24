package com.curso.v1;

import com.curso.pizza.*;

public class SimpleFactoryPizza {

	public static Pizza crearPizza(String tipo) {

		Pizza pizza = null;
		if (tipo.equals("queso")) {
			pizza = new PizzaQueso();
		} else if (tipo.equals("peperoni")) {
			pizza = new PizzaPeperoni();
		} else if (tipo.equals("almeja")) {
			pizza = new PizzaAlmeja();
		} else if (tipo.equals("vegetariana")) {
			pizza = new PizzaVegetariana();
		}
		return pizza;
	}

}
