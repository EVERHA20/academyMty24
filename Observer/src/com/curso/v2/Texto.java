package com.curso.v2;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(txt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Texto other = (Texto) obj;
		return Objects.equals(txt, other.txt);
	}
	
	

}
