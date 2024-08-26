package com.curso.v2;

import java.util.*;

public class PrincipalString {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add(new String("Hola"));
		lista.add(new String("Hello"));
		lista.add(new String("Java"));
		lista.add(new String("Python"));
		
		lista.forEach(System.out::println);
		System.out.println("*******");
		lista.remove(new String("Java"));
		
		lista.forEach(System.out::println);




	}

}
