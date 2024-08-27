package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		double d0 = 8.0;
		double d1 = 4.0;
		double d2 = 3.0;
		double d3 = 12.0;
		double d4 = 2.0;
		
		
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
		
		
		double dr = (d0*(d1+d2))+(((d3/d2)*d1)-(d1/d4)); //70.0
		
		System.out.println(dr);
		
		if ( dr == comp.getValue())
			System.out.println("Suma Correcta");
		else
			System.out.println("Suma Incorrecta");
	}

}
