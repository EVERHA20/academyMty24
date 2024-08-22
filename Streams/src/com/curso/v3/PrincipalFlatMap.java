package com.curso.v3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrincipalFlatMap {

	public static void main(String[] args) {

		List<String> zero = List.of("Duck","Cat");

		var          one  = List.of("Bonobo");
		
		var           two = List.of("Mama Gorilla", "Baby Gorilla");

		Stream<List<String>> animals = 
				Stream.of(zero, one, two);
		
		animals.flatMap(m -> m.stream()) 
		       .forEach(System.out::println);
		
		System.out.println("************");
		
		Stream<List<String>> animals2 = 
				Stream.of(zero, one, two);
		
		List<String> listaAnimals = animals2
				.flatMap(m -> m.stream()) 
		        .collect(Collectors.toList());
		
		System.out.println(listaAnimals);
		

	}

}
