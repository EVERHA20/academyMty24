package com.curso.v0;

import com.curso.pizza.*;

public class TiendaPizza {
	
	public Pizza orderPizza(String tipo) {
		Pizza pizza = null;
		//Código no cerrado para modificación
		if (tipo.equals("queso")) {
			pizza = new PizzaQueso();
		} else if (tipo.equals("peperoni")) {
			pizza = new PizzaPeperoni();
		} else if (tipo.equals("almeja")) {
			pizza = new PizzaAlmeja();
		} else if (tipo.equals("vegetariana")) {
			pizza = new PizzaVegetariana();
		} 
 
		//Esperamos que este código no cambie.
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.empaquetar();

		return pizza;
	}


}
