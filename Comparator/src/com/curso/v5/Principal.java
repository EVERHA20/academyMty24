package com.curso.v5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V4 Lambdas");
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
        
        System.out.println("***POR ????***");
        
        Comparator<Empleado> comparator = (emp1,emp2) -> 0;
			
        Collections.sort(empleados,comparator);
        
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        System.out.println("***POR EDAD***");
        
        comparator = (x,y) -> x.edad - y.edad;
        
        Collections.sort(empleados,comparator);
        
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
        
        System.out.println("***POR SUELDO***");
        
        comparator = (o1,o2) -> (int)(o1.sueldo - o2.sueldo);
			
        Collections.sort(empleados,comparator);
        
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
        
        System.out.println("***POR NOMBRE***");
        
        comparator = (emp1,emp2) -> emp1.nombre.compareTo(emp2.nombre);
			
        Collections.sort(empleados,comparator);
        
        System.out.println("***Consumer MethodReference***");
        empleados.forEach(x -> System.out.println(x));
        
        //empleados.forEach(System.out::println);
        
	}

}
