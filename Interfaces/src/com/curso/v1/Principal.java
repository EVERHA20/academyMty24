package com.curso.v1;

class OperacionHijo implements Operacion{
}

public class Principal {

	public static void main(String[] args) {

		int x = Operacion.ejecutaStatic(5);
		
		System.out.println("Resultado Static: "+x);
		
		x = new OperacionHijo().ejecutaDefault(3);
		
		System.out.println("Resultado Default: "+x);

	}

}
