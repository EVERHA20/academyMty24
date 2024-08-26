package com.curso.v1;

public class Mouse extends Subject {

	void click() {
		System.out.println("Click");
		notificar();
	}

}
