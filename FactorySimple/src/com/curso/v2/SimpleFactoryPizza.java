package com.curso.v2;

import com.curso.pizza.*;

enum TipoPizza {
	QUESO, PEPERONI, ALMEJA, VEJETARIANA
}

public class SimpleFactoryPizza {

	public static Pizza crearPizza(TipoPizza tipo) {

		Pizza pizza = null;

		switch (tipo) {
		case QUESO:
			return new PizzaQueso();
		case PEPERONI:
			return new PizzaPeperoni();
		case ALMEJA:
			return new PizzaAlmeja();
		case VEJETARIANA:
			return new PizzaVegetariana();
		}
		
		return pizza;
	}

}
