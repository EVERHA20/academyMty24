package com.curso.v2;

public class Gif implements Observer {
	
	String img;
	int size;

	public Gif(String img, int size) {
		this.img = img;
		this.size = size;
	}
	
	void showGif() {
		System.out.println(img+" size: "+size);
	}

	@Override
	public void update() {
		showGif();
	}

}
