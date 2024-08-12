
public class Inicio {
	
	//Objetos Mutables
	//Objetos Inmutables
	//primitivos

	public static void main(String[] args) {

		int x = 5;
		String cadena = "Hola";
		StringBuilder sb = new StringBuilder("Hello");
		
		ejecuta(x,cadena,sb);
		
		System.out.println(x); //5 
		System.out.println(cadena); //Hola
		System.out.println(sb); //Hello World

	}

	static void ejecuta(int x, String cadena, StringBuilder sb) {
		
		x = x + 5;
		cadena = cadena.concat(" Mundo");
		sb.append(" World");
		
		System.out.println("*"+x); //10
		System.out.println("*"+cadena); //Hola Mundo
		System.out.println("*"+sb); ////Hello World
		
	}

}
