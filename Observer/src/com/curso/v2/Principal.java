package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		Observer o1 = new Texto("Hello World Java");
		Observer o2 = new Image("Duck");
		Observer o3 = new ScrollBar();

		Mouse mouse = new Mouse();
		
		mouse.attach(o1);
		mouse.attach(o2);
		mouse.attach(o3);
		mouse.click();
		
		System.out.println("********");
		
		mouse.detach(o2);
		mouse.click();
		
		System.out.println("********");
		mouse.detach(o1);
		mouse.attach(new Texto("Hola Mundo Python"));
		mouse.attach(new Gif("Bear",2));
		mouse.click();
		
		System.out.println("********");
		System.out.println("Eliminar texto");
		mouse.detach(new Texto("Hola Mundo Python"));
		mouse.click();


		
	}

}
