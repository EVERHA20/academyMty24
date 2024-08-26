package com.curso.v2;

public class ScrollBar implements Observer  {
	
	void move() {
		System.out.println("Move ScrollBar");
	}

	@Override
	public void update() {
		move();
	}

}
