package com.curso.v1;

import java.util.stream.Stream;

public class Principal3 {

	public static void main(String[] args) {

		//DEFINICIONES DE STREAM
		Stream<Double> randoms = Stream.generate(()->Math.random()); 
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		
//		oddNumbers.limit(10)
//				  .forEach(z -> System.out.println(z));
		
		//DEFINICION DE STREAM
		Stream<Integer> oddNumberUnder100 = Stream.iterate(
				1, // seed
				n -> n < 100, // Predicate to specify when done
				n -> n + 2); // UnaryOperator to get next value
		
		//oddNumberUnder100.forEach(z -> System.out.println(z));
		System.out.println(oddNumberUnder100.count());
	}

}
