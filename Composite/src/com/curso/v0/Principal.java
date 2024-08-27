package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		double d0 = 8.0;
		double d1 = 4.0;
		
		Component comp1 = new LeafConstante(d0);
		Component comp2 = new LeafConstante(d1);
		
		double d2 = comp1.getValue();
		double d3 = comp2.getValue();
		
		if (d0+d1 == d2+d3)
			System.out.println("Suma Correcta");
		else 
			System.out.println("Suma Incorrecta");
	}

}
