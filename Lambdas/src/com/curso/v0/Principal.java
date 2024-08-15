package com.curso.v0;
import java.util.*;

import com.curso.Operacion;

public class Principal {

	public static void main(String[] args) {
		List<Operacion> lista = new ArrayList<>();
		lista.add(new Suma());
		lista.add(new Multi());
		lista.add(new Exp());

		for(Operacion o:lista) {
			System.out.println(o.getClass().getSimpleName());
			System.out.println(o.ejecuta(8,4));
		}
		
	}

}

class Suma implements Operacion{
	@Override
	public int ejecuta(int x, int y) {
		return x+y;
	}
}

class Multi implements Operacion{
	@Override
	public int ejecuta(int x, int y) {
		return x*y;
	}
}

class Exp implements Operacion{
	@Override
	public int ejecuta(int x, int y) {
		return (int)Math.pow(x, y);
	}
}