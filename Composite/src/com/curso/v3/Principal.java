package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		double d0 = 8;
		double d1 = 4;
		double d2 = 3;
		double d3 = 12;
		double d4 = 3;
		double d5 = 4;				
		double d6 = 4;
		double d7 = 2;
		
		Component comp = new CompositeSuma(
				new CompositeMulti(
						new LeafConstante(d0), 
						new CompositeSuma(
								new LeafConstante(d1), 
								new LeafConstante(d2))), 
				new CompositeResta(
						new CompositeMulti(
								new CompositeDiv(
										new LeafConstante(d3), 
										new LeafConstante(d4)), 
								new LeafConstante(d5))
						,new CompositeDiv(
								new LeafConstante(d6), 
								new LeafConstante(d7))));
		
		System.out.println(comp.getValue());
		
		
//		double dr = (d0*(d1+d2))+(((d3/d2)*d1)-(d1/d4)); //70.0
//		
//		System.out.println(dr);
//		
//		if ( dr == comp.getValue())
//			System.out.println("Suma Correcta");
//		else
//			System.out.println("Suma Incorrecta");
	}

}




