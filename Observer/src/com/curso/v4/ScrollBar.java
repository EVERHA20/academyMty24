package com.curso.v4;

public class ScrollBar extends Observer  {
	
	ScrollBar(Subject sub){
		super(sub);
	}
	
	void move() {
		System.out.println("Move ScrollBar");
	}

	@Override
	public void update() {
		move();
	}

}
