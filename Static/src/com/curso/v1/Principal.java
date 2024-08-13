package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Estudiante.contador); //0

		Estudiante e1 = new Estudiante("Patrobas",18);
		Estudiante e2 = new Estudiante("Tercio",28);
		Estudiante e3 = new Estudiante("Epeneto",38);
		Estudiante e4 = new Estudiante("Andronico",20);

		System.out.println(e1);
		System.out.println(Estudiante.contador); //4
		
//		System.out.println(e4);
//		System.out.println(e4.contador); //1
	}

}
