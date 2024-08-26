package com.curso.v3;

public abstract class Observer {
	
	Subject sub;
	
	Observer(Subject sub){
		this.sub = sub;
		sub.attach(this);
	}
	
	abstract void update();

}
