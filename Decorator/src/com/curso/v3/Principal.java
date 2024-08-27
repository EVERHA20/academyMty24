package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V3");
		
		Component component = new MesaBambu(
					new Protector(
					new Enfriador(
					new LapTop())));
		
		System.out.println(component.getNombrePrecio());
		System.out.println("CostoTotal: "+component.getCostoTotal());

	}

}
