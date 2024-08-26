package com.curso.v1;

public class Texto implements Observer {
	
	String txt;

	public Texto(String txt) {
		this.txt = txt;
	}
	
	void showText() {
		System.out.println(txt);
	}

	@Override
	public void update() {
		showText();
	}

}
