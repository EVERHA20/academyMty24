package mr.clase.metStatic;

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.BiFunction;


public class Principal2 {

	public static void main(String[] args) {
	
		
	UnaryOperator<String> uo = Principal2::hacerRico;
	BinaryOperator<String> bO = Principal2::concatenar;
	Supplier<String> s                        = Principal2::getParadigma;
	BiFunction<Float,StringBuilder,Double> bf = Principal2::getParadigma;
		
	}
	
	static String hacerRico(String string) {
		return string + "$$";
	}
	
	static String concatenar(String s1, String s2) {
		return s1+s2;
	}
	
	static String getParadigma() {
		return "Java Funcional";
	}
	
	static double getParadigma(float f, StringBuilder sb) {
		return sb.length() + f;
	}

}
