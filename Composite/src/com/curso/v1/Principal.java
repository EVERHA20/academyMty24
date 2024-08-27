package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		double d0 = 8.0;
		double d1 = 4.0;
		
		Component comp1 = new LeafConstante(d0);
		Component comp2 = new LeafConstante(d1);
		
		Component comp3 = new CompositeSuma(comp1,comp2);
		
		if (d0+d1 == comp3.getValue())
			System.out.println("Suma Correcta");
		else
			System.out.println("Suma Incorrecta");
	}

}
