package com.curso.v0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

public class Principal2 {
	
	public static void main(String... argumentos) {
		
        // Crear un ArrayList de Empleado
        List<Empleado> empleados = new ArrayList<>();

        // Agregar 10 objetos Empleado al ArrayList
        empleados.add(new Empleado("Juan", 25, 3000.00));
        empleados.add(new Empleado("Ana", 30, 3500.00));
        empleados.add(new Empleado("Luis", 28, 3200.00));
        empleados.add(new Empleado("Sofía", 35, 4000.00));
        empleados.add(new Empleado("Carlos", 45, 500.00));
        empleados.add(new Empleado("María", 22, 9000.00));
        empleados.add(new Empleado("Pedro", 40, 4800.00));
        empleados.add(new Empleado("Laura", 29, 3300.00));
        empleados.add(new Empleado("Andrés", 32, 3600.00));
        empleados.add(new Empleado("Elena", 27, 3100.00));
        
        UnaryOperator<Empleado> uo0 = x -> x;
        
        UnaryOperator<Empleado> uo1 = x -> { 
        	System.out.println(x);
        	x.setSueldo(x.getSueldo()*1.10);
        	System.out.println(x);
        	return x;
        };
        
        empleados.replaceAll(uo1);
        
        System.out.println("************");
        
        empleados.forEach(u -> System.out.println(u));
        
        //Collections.sort(empleados, (e1,e2)-> e1.getEdad()-e2.getEdad());
        
        empleados.sort((e1,e2)-> e1.getNombre().compareTo(e2.getNombre()));
        
        System.out.println("************");
        
        empleados.forEach(u -> System.out.println(u));
		
	}

}
