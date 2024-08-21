package com.curso.v1;

import java.util.Optional;
import java.util.stream.Stream;

public class Principal4 {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("monkey", "A","ape","x","9", "bonobo");

		//Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
		
		Optional<String> min = s.min((s1, s2) -> s1.compareTo(s2));
		
		min.ifPresent(y -> System.out.println(y)); // ape
		
		System.out.println("************");
		
		Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");

		Stream<String> infinite = Stream.generate(() -> "chimp");

		s1.findAny()
		  .ifPresent(System.out::println); // monkey (usually) 
		
		infinite.findAny()
		        .ifPresent(System.out::println); // chimp
	}

}
