package com.curso.v3;

import java.util.Comparator;
import java.util.stream.Stream;

public class PrincipalSort {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("z", "B", "4", "c");
		s.sorted().forEach(System.out::print);

		System.out.println("");
		Stream<String> s1 = Stream.of("z", "B", "4", "c");
		s1.sorted(Comparator.reverseOrder())
		  .forEach(System.out::print);
		
		
	}

}
