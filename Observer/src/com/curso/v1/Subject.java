package com.curso.v1;

import java.util.*;

public abstract class Subject {

	List<Observer> observers = new ArrayList<>();
	
	void attach(Observer o) {
		observers.add(o);
	}
	
	void detach(Observer o) {
		observers.remove(o);
	}
	
	void notificar() {
		for(Observer o:observers)
			o.update();
	}

}
