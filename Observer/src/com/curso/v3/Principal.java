package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		
		new Texto("Hello World Java",mouse);
		new Image("Duck",mouse);
		new ScrollBar(mouse);

		mouse.click();
		
		System.out.println("********");
		
		mouse.detach(new Texto("Hello World Java",mouse));
		mouse.click();
		
		System.out.println("********");
		mouse.detach(new Image("Duck",mouse));
		new Texto("Hola Mundo Python",mouse);
		new Gif("Gif Bear",2,mouse);
		mouse.click();
		
		System.out.println("********");
		mouse.detach(new Texto("Hola Mundo Python",mouse));
		mouse.click();

		
	}

}
