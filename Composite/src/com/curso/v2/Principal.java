package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		double d0 = 8.0;
		double d1 = 4.0;
		double d2 = 6.0;
		double d3 = 9.0;
		double d4 = 3.0;
		
		Component comp = new CompositeSuma(
					new CompositeSuma(
							new LeafConstante(d0)
							,
							new CompositeSuma(
									new LeafConstante(d1),
									new LeafConstante(d4)
									)
							)
				,
					new CompositeSuma(
							new LeafConstante(d2)
							,
							new LeafConstante(d3)
							)
				);
		
		
		
		if (d0+d1+d2+d3+d4 == comp.getValue())
			System.out.println("Suma Correcta");
		else
			System.out.println("Suma Incorrecta");
	}

}
