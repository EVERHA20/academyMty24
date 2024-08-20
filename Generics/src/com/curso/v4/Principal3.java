package com.curso.v4;

public class Principal3 {
	
	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		
		show(intArray);
		show(doubleArray);
		show(charArray);
	
	}
	
	static <T> void show(T[] array) {
		for (T t:array)
			System.out.println(t);
	}

}
