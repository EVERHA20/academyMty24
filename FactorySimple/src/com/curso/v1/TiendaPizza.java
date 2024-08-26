package com.curso.v1;

import com.curso.pizza.*;

public class TiendaPizza {
	
	public Pizza orderPizza(String tipo) {
		
		Pizza pizza = SimpleFactoryPizza.crearPizza(tipo);
		
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.empaquetar();

		return pizza;
	}


}
