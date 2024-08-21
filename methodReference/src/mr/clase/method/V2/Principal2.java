package mr.clase.method.V2;

public class Principal2 {

	public static void main(String[] args) {
		
		String cadena1 = "Hola ";
		String cadena2 = "Mundo Basic";
		
		String resultado = Utils.transforma(
				cadena1, cadena2,(u,t) -> u.concat(t));
		
		System.out.println(resultado);
		
	}

}
