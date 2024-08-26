package com.curso.v1;

public class Cliente1 {
	
	public static void main(String[] args) {
		
		TareaBuilder tareaBuilder = new TareaBuilder(20);//ID
		
		//tareaBuilder = tareaBuilder.setTarea("Comprar leche");
		
		tareaBuilder.setTarea("Comprar leche");//TAREA DESC.
		tareaBuilder.setDefinidaPor("Epeneto");
		tareaBuilder.setAsignadaA("Andronico");
		
		System.out.println(tareaBuilder);

		Tarea tarea = tareaBuilder.build();
		
		Tarea tarea2 = new TareaBuilder(20)
				.setTarea("Comprar leche")
				.setDefinidaPor("Epeneto")
				.setAsignadaA("Andronico")
				.build();
		
		System.out.println(tarea2);
		
		String cadena = new StringBuilder("Hello")
				.append(" World")
				.append(" Java")
				.toString();
		
		System.out.println(cadena);
	}

}