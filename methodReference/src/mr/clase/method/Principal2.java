package mr.clase.method;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Principal2 {

	public static void main(String[] args) {
		
	Principal2 pri2 = new Principal2();
	
	//UnaryOperator<String> uo = (s) -> pri2.hacerRico(s);
	BiFunction<Principal2,String,String> bf = Principal2::hacerRico;
	System.out.println(bf.apply(pri2,"Python "));
	
	
	TriFunction<Principal2,String,String,String> to 
								= Principal2::concatenar;
	System.out.println(to.apply(pri2, "Hola ", "Mundo"));
	
    Function<Principal2,String> s  = Principal2::getParadigma;
    System.out.println(s.apply(pri2));
   
    TriFunction<Principal2,Float,StringBuilder,Double> tf2 = 
    		Principal2::getParadigma;
    
	double d = tf2.apply(pri2,3.4F, new StringBuilder("hola"));
	System.out.println(d);
	}
	
	String hacerRico(String string) {
		return string + "$$";
	}
	
	String concatenar(String s1, String s2) {
		return s1+s2;
	}
	
	String getParadigma() {
		return "Java Funcional";
	}
	
	double getParadigma(float f, StringBuilder sb) {
		return sb.length() + f;
	}

}
