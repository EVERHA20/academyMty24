package mr.clase.neww;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiFunction;


public class Principal {

	public static void main(String[] args) {

		//DEFINICION
		//Supplier<Persona> sup = () -> new Persona();
		Supplier<Persona> sup = Persona::new;
		Persona per1 = sup.get();
		System.out.println(per1);
		
		//Function<Integer,Persona> fun = i -> new Persona(i);
		Function<Integer,Persona> fun = Persona::new;
		Persona per2 = fun.apply(9);
		System.out.println(per2);
		
		BiFunction<Integer,String,Persona> bf = Persona::new;
		Persona per3 = bf.apply(19,"Filologo");
		System.out.println(per3);
		
		TriFunction<StringBuilder,Integer,String,Persona> triF =
				Persona::new;
		Persona per4 = triF.apply(new StringBuilder("SB"),5,"Patrobas");
		System.out.println(per4);
		
	}

}
