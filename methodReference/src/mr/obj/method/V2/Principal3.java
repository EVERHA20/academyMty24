package mr.obj.method.V2;

public class Principal3 {

	public static void main(String[] args) {
		
		String cadena1 = "Hola ";
		String cadena2 = "Mundo JavaScript";
		
		String resultado = Utils.transforma(
				cadena2, cadena1::concat);
		
		System.out.println(resultado);
		
	}

}
