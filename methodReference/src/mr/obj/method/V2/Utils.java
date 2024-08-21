package mr.obj.method.V2;

import java.util.function.UnaryOperator;

public class Utils {
	
	public static String transforma(
			String s, UnaryOperator<String> uo) {
		
		return uo.apply(s);
	}

}