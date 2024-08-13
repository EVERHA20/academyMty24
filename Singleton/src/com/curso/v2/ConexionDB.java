package com.curso.v2;

public class ConexionDB {
	
	private String name;
	private static int contador ;
	
	private static ConexionDB conexion = new ConexionDB("MySql");

	private ConexionDB(String name) {
		this.name = name;
		++contador;
	}
	
	static public ConexionDB getInstance() {
		return conexion;
	}

	@Override
	public String toString() {
		return "ConexionDB [name=" + name + "]";
	}
	
	public static int getContador() {
		return contador;
	}

}
