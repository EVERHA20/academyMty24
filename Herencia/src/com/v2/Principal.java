package com.v2;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		Perro ani1 = new Perro();
		ani1.getSound();
		System.out.println("***Interface***");
		
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

interface Animal{
	//public abstract
	void getSound();
}

class Perro implements Animal{
	public void getSound() {
		System.out.println("Guau guau");
	}
}

class Gato implements Animal{
	public void getSound() {
		System.out.println("Miau miau");
	}
}

class Pato implements Animal{
	public void getSound() {
		System.out.println("kuau kuau");
	}
}

