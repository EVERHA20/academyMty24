package mr.clase.metStatic;

public class Numero {
	
	public static boolean esMayor10(int n1, int n2) {
		return (n1 + n2) > 10;
	}
	
	public static boolean esMayor10(int n1) {
		return n1*2  > 10;
	}
	
	public static int esMayor10(String s,Double d) {
		return (int)(s.length()+d);
	}

}
