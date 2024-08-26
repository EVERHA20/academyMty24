package com.curso.v1;

public class ScrollBar implements Observer  {
	
	void move() {
		System.out.println("Move ScrollBar");
	}

	@Override
	public void update() {
		move();
	}

}
