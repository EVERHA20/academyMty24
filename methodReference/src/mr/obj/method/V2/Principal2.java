package mr.obj.method.V2;

public class Principal2 {

	public static void main(String[] args) {
		
		String cadena1 = "Hola ";
		String cadena2 = "Mundo C++";
		
		String resultado = Utils.transforma(
				cadena2, t -> cadena1.concat(t));
		
		System.out.println(resultado);
		
	}

}
