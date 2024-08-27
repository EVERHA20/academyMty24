package com.curso.v0;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TestComposite {

	@Test
	void test() {
		double d1 = 5.0;
		double d2 = 3.0;
		assertEquals(8.0,d1+d2);
	}
	
	@Test
	void testConstante1() {
		double d = 5.0;
		Component comp = new LeafConstante(d);
		assertEquals(d, comp.getValor());
	}
	
	@Test
	void testConstante2() {
		double d = 8.0;
		Component comp = new LeafConstante(d);
		assertEquals(d, comp.getValor());
	}
	
	@Test
	void testSumaSimple() {
		double d1 = 8.0;
		Component comp1 = new LeafConstante(d1);
		double d2 = 4.0;
		Component comp2 = new LeafConstante(d2);
		
		Component comp3 = new CompositeSuma(comp1,comp2);
		assertEquals(d1+d2,comp3.getValor());
	}
	
	@Test
	void testSumaCompleja() {
		
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
		
		assertEquals(d0+d1+d2+d3+d4,comp.getValor());
	}
	
	@Test
	void testMultiSimple() {
		double d1 = 8.0;
		Component comp1 = new LeafConstante(d1);
		double d2 = 4.0;
		Component comp2 = new LeafConstante(d2);
		
		Component comp3 = new CompositeMulti(comp1,comp2);
		assertEquals(d1*d2,comp3.getValor());
	}
	
	@Test
	void testMultiCompleja() {
		
		double d0 = 8.0;
		double d1 = 4.0;
		double d2 = 6.0;
		double d3 = 9.0;
		double d4 = 3.0;
		
		Component comp = new CompositeMulti(
					new CompositeMulti(
							new LeafConstante(d0)
							,
							new CompositeMulti(
									new LeafConstante(d1),
									new LeafConstante(d4)
									)
							)
				,
					new CompositeMulti(
							new LeafConstante(d2)
							,
							new LeafConstante(d3)
							)
				);
		
		assertEquals(d0*d1*d2*d3*d4,comp.getValor());
	}

}
