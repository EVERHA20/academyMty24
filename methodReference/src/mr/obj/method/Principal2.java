package mr.obj.method;

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.BiFunction;


public class Principal2 {

	public static void main(String[] args) {
		
	Principal2 pri2 = new Principal2();
	
	//UnaryOperator<String> uo = (s) -> pri2.hacerRico(s);
	UnaryOperator<String> uo = pri2::hacerRico;
	System.out.println(uo.apply("Python "));
	
	
	BinaryOperator<String> bo = pri2::concatenar;
	System.out.println(bo.apply("Hello", "World"));
	
    Supplier<String> s  = pri2::getParadigma;
    System.out.println(s.get());
    
	BiFunction<Float,StringBuilder,Double> bf = pri2::getParadigma;
	double d = bf.apply(3.4F, new StringBuilder("hola"));
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
