package com.curso.v3;

import java.util.Objects;

public class Image extends Observer {
	
	String img;

	public Image(String img, Subject sub) {
		super(sub);
		this.img = img;
	}
	
	void showImage() {
		System.out.println(img);
	}

	@Override
	public void update() {
		showImage();
	}

	@Override
	public int hashCode() {
		return Objects.hash(img);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Image other = (Image) obj;
		return Objects.equals(img, other.img);
	}

}
