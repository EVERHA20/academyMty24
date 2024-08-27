package com.curso.pizza.sinfm;

import com.curso.pizzafm.*;

public class Principal {
	
	public static void main(String[] args) {
		TiendaPizzaSinFactory tp = 
				new TiendaPizzaSinFactory();
		
		Pizza pizza = tp.crearPizza("Monterrey", "queso");
		
		
	}

}
