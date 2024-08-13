package com.curso.v0;

public class ConexionDB {
	
	private String name;
	private static int contador;


	public ConexionDB(String name) {
		this.name = name;
		++contador;
	}

	@Override
	public String toString() {
		return "ConexionDB [name=" + name + "]";
	}
	
	public static int getContador() {
		return contador;
	}

}
