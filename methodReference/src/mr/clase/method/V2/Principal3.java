package mr.clase.method.V2;

public class Principal3 {

	public static void main(String[] args) {
		
		String cadena1 = "Hola ";
		String cadena2 = "Mundo Kotlin";
		
		String resultado = Utils.transforma(
				cadena1, cadena2, String::concat);
		
		System.out.println(resultado);
		
	}

}
