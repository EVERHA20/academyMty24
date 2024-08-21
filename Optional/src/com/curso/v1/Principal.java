package com.curso.v1;

import java.util.Optional;

public class Principal {

	public static void main(String[] args) {

		System.out.println(average(90,100));		
		System.out.println(average());
		
		Optional<Double> opt = average(90, 100);
		
		if (opt.isPresent()) 
			System.out.println(opt.get()); // 95.0
		
		opt = average();
		//System.out.println(opt.get());
		
		System.out.println("*******");
		
		opt = average(90,100);
		opt.ifPresent(x -> System.out.println(x));
		
		System.out.println("*******");

		opt = average();

		System.out.println(opt.orElse(Double.NaN)); 
		System.out.println(opt.orElseGet(() -> Math.random()));
		System.out.println("*******");

		opt = average();

		//System.out.println(opt.orElseThrow());
		
//		System.out.println(
//				opt.orElseThrow(
//					() -> new IllegalStateException()));
		
		System.out.println("*******");

		opt = average(90, 100);

		System.out.println(opt.orElse(Double.NaN)); 
		System.out.println(opt.orElseGet(() -> Math.random())); 
		System.out.println(opt.orElseThrow());
	}
	
	
	
	

	public static Optional<Double> average(int... scores) {

		if (scores.length == 0)
			return Optional.empty(); //CREAR OPTIONAL VACIO
		int sum = 0;
		for (int score : scores)
			sum += score;
		
		return Optional.of((double) sum / scores.length); //CREAR OPTIONAL VALUE
	}

}
