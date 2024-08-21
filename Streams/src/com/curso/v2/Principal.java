package com.curso.v2;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
	
	public static void main(String[] args) {
		
		Stream<String> streamOther = Stream.of("w", "o", "l", "f");
		
		StringBuilder word = streamOther.collect( 
				() -> new StringBuilder(), 
				(a,b) -> a.append(b), 
				(x,z) -> x.append(z));
		
		System.out.println(word); // wolf
		
		/////////////////////////////////
		
		Stream<String> stream = Stream.of("w", "o", "l", "f");

		TreeSet<String> set = stream.collect(
				() -> new TreeSet<String>(), //DEFINIR EL COLLECTION 
				(a,b) -> a.add(b), //AÑADIR ELEMENTOS AL COLLECTION
				(x,z) -> x.addAll(z) ); //RECOLECTAR TODOS TreeSet
				
		System.out.println(set); // [f, l, o, w]
		
		///////////////////////////
		
		System.out.println("Collector Object");
		
		Stream<String> stream2 = Stream.of("w", "o", "l", "f");

		Collector collector = Collectors.
								toCollection(()->new TreeSet<String>());
		
		Object set2 = stream2.collect(collector); 
		
		System.out.println(set2); // [f, l, o, w]
		
		///////////////////////////
		
		System.out.println("Collector Generics");

		Stream<String> stream3 = Stream.of("w", "o", "f" ,"l", "f");

		Collector<String,?,TreeSet<String>> collector3 = Collectors.		
				toCollection(()->new TreeSet<String>());

		TreeSet<String> set3 = stream3.collect(collector3); 

		System.out.println(set3); // [f, l, o, w]
		
		///////////////////////////
		
		System.out.println("Demo 4");
		
		Stream<String> stream4 = Stream.of("w", "o", "l", "f");

		Set<String> set4 = stream4.collect(Collectors.toSet()); 
		
		System.out.println(set4); // [f, w, l, o]
		
	}
	
	

}
