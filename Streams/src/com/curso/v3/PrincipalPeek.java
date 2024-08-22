package com.curso.v3;

import java.util.stream.Stream;

public class PrincipalPeek {

	public static void main(String[] args) {
		var stream = Stream.of("black bear",
							   "gazo",
				               "brown bear", 
				               "grizzly");
		long count = stream
				     .filter(s -> s.startsWith("g"))
				     .peek(System.out::println)
				     .map(c -> c.length())
				     .peek(System.out::println)
				     .filter(i -> i == 4)
				     .peek(System.out::println)
				     .count(); 
		
		System.out.println("count: "+ count);
																								// System.out.println(count);

	}

}
