package com.curso.v0;

public class Mouse {
	
	//HAS-A (COMPOSICION)
	//Problem; ALTO ACOPLAMIENTO
	Texto txt;
	Image img = new Image("Image Duck");
	ScrollBar sb;
	
	Mouse(){
		txt = new Texto("Hello World Java");
	}
	
	void click() {
		System.out.println("Click");
		txt.showText();
		img.showImage();
		sb = new ScrollBar();
		sb.move();
	}

}
