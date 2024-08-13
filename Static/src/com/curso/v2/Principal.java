package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V2");
		System.out.println(Estudiante.getContador()); //0

		Estudiante e1 = new Estudiante("Patrobas",18);
		Estudiante e2 = new Estudiante("Tercio",28);
		Estudiante e3 = new Estudiante("Epeneto",38);
		Estudiante e4 = new Estudiante("Andronico",20);

		System.out.println(e1);
		System.out.println(Estudiante.getContador()); //4
		

	}

}
