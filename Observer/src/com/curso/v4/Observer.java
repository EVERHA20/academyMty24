package com.curso.v4;

public abstract class Observer {
		
	Observer(Subject sub){
		sub.attach(this);
	}
	
	abstract void update();

}
