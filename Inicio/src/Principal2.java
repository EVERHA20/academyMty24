import java.io.PrintStream;
import java.lang.System;
import java.util.stream.Stream;

public class Principal2 {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
		PrintStream ps = System.out;
		ps.println("Hola Mundo");
		
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");

		s.filter(x -> x.startsWith("m")) 
		 .forEach(ps::print); // monkey
		
	}

}
