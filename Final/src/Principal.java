
public class Principal  {

	public static void main(String[] args) {
		final int x = 5; //Constante
		//x = 6;
		System.out.println(x);
		
		final StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		//sb = new StringBuilder("Otro");
		//sb = null;
		System.out.println(sb);
		
		final String cadena = "Hola";
		//cadena = cadena.concat(" Mundo");
		System.out.println(cadena);
		
	}
	
	void ejecuta() {	
	}

}

class OtroPrincipal extends Principal {
	@Override
	void ejecuta() {	
	}
}
