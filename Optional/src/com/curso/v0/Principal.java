package com.curso.v0;

import java.util.Optional;

public class Principal {

	public static void main(String[] args) {

		average(new int[] {1,2,3,4,5,6});
		average(new int[] {});
	}
	
	public static Optional<Double> average(int[] scores) { 
		if (scores.length == 0) return Optional.empty();
		int sum = 0;
		for (int score: scores) sum += score; 
		return Optional.of((double) sum / scores.length);
	}

}
