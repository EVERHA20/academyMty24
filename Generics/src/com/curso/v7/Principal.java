package com.curso.v7;

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
		//showFigurasUpper(listaObjetos); //NO SE PUEDE
		showFigurasLower(listaObjetos);
		
		List<String> listaString = new ArrayList<>();
		listaString.add("Hello");
		listaString.add("World");
		
		//showObjects(listaString); //NO SE PUEDE
		showObjectsUnbounded(listaString);
		//showFigurasUpper(listaString);//NO SE PUEDE
		//showFigurasLower(listaString);//NO SE PUEDE

		List<Figura> listaFigura = new ArrayList<>();
		listaFigura.add(new Circulo(1.0));
		listaFigura.add(new Cuadrado(1.0));
		listaFigura.add(new Triangulo(1.0));
		
		//showObjects(listaFigura); //NO SE PUEDE
		showObjectsUnbounded(listaFigura);
		showFigurasUpper(listaFigura);
		showFigurasLower(listaFigura);

		List<Circulo> listaCirculo = new ArrayList<>();
		listaCirculo.add(new Circulo(2.0));
		listaCirculo.add(new Circulo(2.0));
		
		//showObjects(listaCirculo); //NO SE PUEDE
		showObjectsUnbounded(listaCirculo);
		showFigurasUpper(listaCirculo);
		//showFigurasLower(listaCirculo);
	
		List<Cuadrado> listaCuadrado = new ArrayList<>();
		listaCuadrado.add(new Cuadrado(2.0));
		listaCuadrado.add(new Cuadrado(2.0));

		//showObjects(listaCuadrado); //NO SE PUEDE
		showObjectsUnbounded(listaCuadrado);
		showFigurasUpper(listaCuadrado);
		//showFigurasLower(listaCuadrado);

		
		List<Triangulo> listaTriangulo = new ArrayList<>();
		listaTriangulo.add(new Triangulo(2.0));
		listaTriangulo.add(new Triangulo(2.0));

		
		//showObjects(listaTriangulo); //NO SE PUEDE
		showObjectsUnbounded(listaTriangulo);
		showFigurasUpper(listaTriangulo);
		//showFigurasLower(listaTriangulo);

		

	}
	
	static void showObjects(List<Object> listaObjetos) {
		listaObjetos.add(new Object());
		for (Object o:listaObjetos)
			System.out.println(o);
	}
	
	static void showObjectsUnbounded(List<?> lista) {
		//lista.add(new Object());
		for (Object o:lista)
			System.out.println(o);
	}
	
	static void showFigurasUpper(List<? extends Figura> lista) {
		//lista.add(new Figura(5.0));
		System.out.println("LISTA FIGURAS O SUS SUBCLASES");
		for (Figura f:lista)
			System.out.println(f);
	}

	static void showFigurasLower(List<? super Figura> lista) {
		lista.add(new Figura(99.0));
		System.out.println("LISTA FIGURAS O SUS SUPERCLASES");
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
