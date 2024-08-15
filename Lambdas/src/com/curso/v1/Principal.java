package com.curso.v1;

import java.util.*;
import com.curso.Operacion;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V1");
		
		List<Operacion> lista = new ArrayList<>();
		
		lista.add((z,w)->z+w);
		lista.add((int1,int2)->int1*int2);
		lista.add((pato1,pato2)->(int)Math.pow(pato1,pato2));

		for(Operacion o:lista) {
			System.out.println(o.ejecuta(8,4));
		}
		
	}

}

