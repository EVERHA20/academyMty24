package com.v0;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Perro ani1 = new Perro();
		ani1.getSound();
		//ani1 = new Gato();
		System.out.println("******");
		
		Animal ani2 = new Perro();
		ani2.getSound();
		ani2 = new Gato();
		ani2.getSound();
		ani2 = new Pato();
		ani2.getSound();
		System.out.println("***getAnimal()***");

		Animal ani3 = getAnimal();
		ani3.getSound();

	}

	static Animal getAnimal() {
		Animal[] animales = {
				new Perro(),
				new Gato(),
				new Pato()
		};
		int i = new Random().nextInt(animales.length);
		return animales[i];
	}

}

class Animal{
	void getSound() {
		System.out.println("Sin sonido");
	}
}

class Perro extends Animal{
	void getSound() {
		System.out.println("Guau guau");
	}
}

class Gato extends Animal{
	void getSound() {
		System.out.println("Miau miau");
	}
}

class Pato extends Animal{
	void getSound() {
		System.out.println("kuau kuau");
	}
}

