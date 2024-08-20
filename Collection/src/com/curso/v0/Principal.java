package com.curso.v0;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String... args) {
		
		Map<String,Integer> cantidadFruta = new HashMap<>();
		
		cantidadFruta.put("papaya", 7);
		cantidadFruta.put("manzana", 4);
		cantidadFruta.put("aguacate", 5);
		cantidadFruta.put("papaya", 4);

		System.out.println(cantidadFruta);
		

		Set<String> claves = cantidadFruta.keySet();
		System.out.println(claves.getClass().getName());

		System.out.println(claves);
		
		Collection<Integer> valores = cantidadFruta.values();
		
		System.out.println(valores.getClass().getName());
		System.out.println(valores);

		Map<Long,List<Integer>> mapLists = new HashMap<Long,List<Integer>>();
		//Map<Long,List<Integer>> mapLists = new HashMap<>();
		//var mapLists = new HashMap<Long,List<Integer>>();
	}

}
