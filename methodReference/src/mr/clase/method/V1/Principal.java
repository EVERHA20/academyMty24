package mr.clase.method.V1;

import java.util.function.Consumer;
import java.util.function.BiPredicate;


public class Principal {

	public static void main(String[] args) {
		
		Mecanico instanciaMec = new Mecanico();
		
		Carro carro5 = new Carro();
		carro5.id = 777;
		
		//instanciaMec.arreglar(carro5); //OO
		
		//DEFINICION LAMBDA
		//Consumer<Carro> cons =  c -> instanciaMec.arreglar(c);
		
		Consumer<Carro> cons = instanciaMec::arreglar;
		cons.accept(carro5);
		
		BiPredicate<Carro,Double> bp = instanciaMec::arreglar;
		bp.test(carro5,200.08);

	}

}

class Carro{
	int id;
	String color;
}

class Mecanico {
	void arreglar(Carro c) {
		System.out.println("Arreglando carro id: "+c.id);
	}
	boolean arreglar(Carro c, double costo) {
		System.out.println("Arreglando carro id: "+c.id+", Costo:"+costo);
		return true;
	}
}


