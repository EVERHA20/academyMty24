package com.curso.v2;

import com.curso.pizza.*;

public class TiendaPizza {
	
	public Pizza orderPizza(TipoPizza tipo) {
		
		Pizza pizza = SimpleFactoryPizza.crearPizza(tipo);
		
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.empaquetar();

		return pizza;
	}


}
