package com.curso.v1;

import java.util.stream.Stream;

public class PrincipalReduce {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("w", "o", "l", "f");
		
		String word = stream.reduce("", (s, c) -> s + c); 
		
		System.out.println(word); //"wolf"
		
		Stream<String> stream1 = Stream.of("w", "o", "l", "f");

		word = stream1.reduce("", (s,c) -> s.concat(c)); 
		
		System.out.println(word); // wolf
		
		Stream<Integer> streamInt = Stream.of(2, 3, 4, 5);
		
		Integer r = streamInt.reduce(1, (s, c) -> s * c); 
		
		System.out.println(r); //120
		
		System.out.println("*************");
		
		Stream<String> stream2 = Stream.of("w", "o", "l", "f!");

		stream2.reduce("", (i, s) -> i+s); 
		
		System.out.println(); // 5
	}

}
