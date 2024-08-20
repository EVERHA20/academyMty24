package com.curso.v6;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		List<Object> listaObjetos = new ArrayList<>();
		listaObjetos.add(new Object());
		listaObjetos.add("Hello World Java");
		listaObjetos.add(new Figura(0));
		listaObjetos.add(new Triangulo(0));
		
		showObjects(listaObjetos);
		showObjectsUnbounded(listaObjetos);
		
		List<String> listaString = new ArrayList<>();
		listaString.add("Hello");
		listaString.add("World");
		
		//showObjects(listaString); //NO SE PUEDE
		showObjectsUnbounded(listaString);

		
		List<Figura> listaFigura = new ArrayList<>();
		listaFigura.add(new Circulo(1.0));
		listaFigura.add(new Cuadrado(1.0));
		listaFigura.add(new Triangulo(1.0));

		//showObjects(listaFigura); //NO SE PUEDE
		showObjectsUnbounded(listaFigura);

		
		List<Circulo> listaCirculo = new ArrayList<>();
		listaCirculo.add(new Circulo(2.0));
		listaCirculo.add(new Circulo(2.0));
		
		//showObjects(listaCirculo); //NO SE PUEDE
		showObjectsUnbounded(listaCirculo);

		

		List<Cuadrado> listaCuadrado = new ArrayList<>();
		listaCuadrado.add(new Cuadrado(2.0));
		listaCuadrado.add(new Cuadrado(2.0));

		//showObjects(listaCuadrado); //NO SE PUEDE
		showObjectsUnbounded(listaCuadrado);

		
		List<Triangulo> listaTriangulo = new ArrayList<>();
		listaTriangulo.add(new Triangulo(2.0));
		listaTriangulo.add(new Triangulo(2.0));

		
		//showObjects(listaTriangulo); //NO SE PUEDE
		showObjectsUnbounded(listaTriangulo);

		

	}
	
	static void showObjects(List<Object> listaObjetos) {
		for (Object o:listaObjetos)
			System.out.println(o);
	}
	
	static void showObjectsUnbounded(List<?> lista) {
		for (Object o:lista)
			System.out.println(o);
	}

}

class Figura{
	private double area;
	public Figura(double area) {
		this.area = area;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+
				" [area=" + area + "]";
	}
}
class Circulo extends Figura{
	public Circulo(double area) {
		super(area);
	}
}
class Cuadrado extends Figura{
	public Cuadrado(double area) {
		super(area);
	}
}
class Triangulo extends Figura{
	public Triangulo(double area) {
		super(area);
	}
}
