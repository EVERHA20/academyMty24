package com.curso.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrincipalFunctional {
	
	private static Employee[] arrayOfEmps = { 
			new Employee(0, "Patrobas", 100.0), 
			new Employee(1, "Tercio", 200.0),
			new Employee(2, "Andronico", 300.0), 
			new Employee(3, "Epeneto", 400.0),
			new Employee(4, "Filologo", 500.0) };

	public static void main(String[] args) {
		
		System.out.println("Functional");
		
		//List<Employee> listEmpleados = Arrays.asList(arrayOfEmps);
		
		//1.Filtrar los que ganan menos de 400
		//2.Incrementar su sueldo en 200	
		//3.Filtrar los que tengan una longitud mayor a 6 en su nombre	
		//4.Ordernar por nombre
		//5.Obtener una lista de los nombres: List<String> nombres
		
		Stream<Employee> streamEmp = Arrays.stream(arrayOfEmps);
		
		List<String> listaNombres = streamEmp //CREA
				.filter(e->e.getSalary()<400)
				.peek(y->y.setSalary(y.getSalary()+200))
				.filter(z -> z.getNombre().length()>6)
				.sorted(Comparator.comparing(Employee::getNombre))
				.map(e -> e.getNombre())
				//.count();
				.collect(Collectors.toList()); //TERMINA
		
		listaNombres.forEach(x -> System.out.println(x));
		
		Long r = Arrays.stream(arrayOfEmps).count();
		
		System.out.println(r); //5

		
		
	}

}

