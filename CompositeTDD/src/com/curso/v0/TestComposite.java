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

}
