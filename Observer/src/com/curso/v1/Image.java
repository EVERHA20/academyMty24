package com.curso.v1;

public class Image implements Observer {
	
	String img;

	public Image(String img) {
		this.img = img;
	}
	
	void showImage() {
		System.out.println(img);
	}

	@Override
	public void update() {
		showImage();
	}

}
