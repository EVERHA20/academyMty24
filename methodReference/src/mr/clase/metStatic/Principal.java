package mr.clase.metStatic;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.BiFunction;


public class Principal {

	public static void main(String[] args) {
		
		boolean b = false;

		//DEFINICIÓN LAMBDA
//		BiPredicate<Integer,Integer> bp =
//				(i1,i2) -> Numero.esMayor10(i1,i2);
				
		BiPredicate<Integer,Integer> bp = 
						   Numero::esMayor10;
		//EJECUTO
		b = bp.test(6, 5);
		System.out.println("BiPredicate: "+b);
		
		System.out.println("***********");
		
//		Function<Integer,Boolean> fun = 
//					i -> Numero.esMayor10(i);
					
		Function<Integer,Boolean> fun = 
							Numero::esMayor10;
					
		b = fun.apply(6);
		
		System.out.println("Function: "+b);
		
		System.out.println("***********");

		BiFunction<String,Double,Integer> bf =
				Numero::esMayor10;
		
		int i = bf.apply("hello", 8.0);
		System.out.println(i);
		
		
	}

}
