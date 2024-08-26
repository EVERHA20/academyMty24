package com.curso.v4;

public class Gif extends Observer {
	
	String img;
	int size;

	public Gif(String img, int size, Subject sub) {
		super(sub);
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
