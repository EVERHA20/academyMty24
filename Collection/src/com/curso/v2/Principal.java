package com.curso.v2;

import java.util.Set;
import java.util.TreeSet;

public class Principal {
	
	public static void main(String... argumentos) {
		
        Set<Empleado> empleados = new TreeSet<>();

        empleados.add(new Empleado("Juan", 25, 3000.00));
        empleados.add(new Empleado("Ana", 30, 3500.00));
        empleados.add(new Empleado("Luis", 28, 3200.00));
        empleados.add(new Empleado("Sofía", 35, 4000.00));
        empleados.add(new Empleado("Carlos", 45, 500.00));
        empleados.add(new Empleado("María", 10, 9000.00));
        empleados.add(new Empleado("Pedro", 40, 4800.00));
        empleados.add(new Empleado("Laura", 29, 3300.00));
        empleados.add(new Empleado("Andrés", 32, 3600.00));
        empleados.add(new Empleado("Elena", 27, 3100.00));
        
        empleados.forEach(x -> System.out.println(x));
        
        System.out.println("********************");
        empleados.remove(new Empleado("Patrobas", 29, 0.00));
        
        empleados.forEach(x -> System.out.println(x));

		
	}

}
