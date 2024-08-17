package com.curso.v2;

import java.util.function.Consumer;
import java.util.function.BiFunction;

public class PrincipalConsumer {

	public static void main(String[] args) {

		System.out.println("V2 Consumer");
		
		//DEFINICION
		Consumer<String> cons1 = 
				cadena -> System.out.println(cadena);
				
		//EJECUTAR
		cons1.accept("Hello World");
		
		Consumer<Object> cons2 = 
				x -> {return;};
				
		cons2.accept(new Object());
		
		System.out.println("****BiFunction*****");
		
		//           T   ,   U   ,     R
		BiFunction<String,Integer,StringBuilder>
			bf = (t,u) -> new StringBuilder(t+u);
			
		StringBuilder sb = bf.apply("Hello",100);
		
		System.out.println(sb);
		
		
	}

}
