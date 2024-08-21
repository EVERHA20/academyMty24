package mr.clase.method.V2;

import java.util.function.BinaryOperator;

public class Principal {

	public static void main(String[] args) {
		
		String cadena1 = "Hola ";
		String cadena2 = "Mundo Pascal";

		BinaryOperator<String> bo = (u,t) -> u.concat(t);
		
		String resultado = Utils.transforma(cadena1,cadena2, bo);
		
		System.out.println(resultado);
		
	}

}
