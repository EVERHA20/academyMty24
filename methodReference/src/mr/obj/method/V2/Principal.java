package mr.obj.method.V2;

import java.util.function.UnaryOperator;

public class Principal {

	public static void main(String[] args) {
		
		String cadena1 = "Hola ";
		String cadena2 = "Mundo Java";

		UnaryOperator<String> uo = t -> cadena1.concat(t);
		
		String resultado = Utils.transforma(cadena2, uo);
		
		System.out.println(resultado);
		
	}

}
