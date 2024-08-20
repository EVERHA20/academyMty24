package com.curso.v0;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal3 {

	public static void main(String... args) {
		
		Map<String,Integer> cantidadFruta = new HashMap<>();
		
		cantidadFruta.put("papaya", 7);
		cantidadFruta.put("manzana", 4);
		cantidadFruta.put("aguacate", 5);
		cantidadFruta.put("papaya", 4);

		cantidadFruta.forEach((k,v)->
				System.out.println("Clave: "+k+", Valor:"+v));
	}

}
