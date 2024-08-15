package com.curso.v1;

public class PricipalClient2 {

	public static void main(String[] args) {

		Estudiante e = new Estudiante("Andronico",25);
		
		e.nombre = "Tercio"; //<=No se recomienda
		
		System.out.println(e);
		
	}

}
