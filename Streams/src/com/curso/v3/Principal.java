package com.curso.v3;

import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");

		//s.map(t -> t.length())
		
		s.map(String::length) //=> Stream<Integer>
		.forEach(System.out::print);

	}

}
