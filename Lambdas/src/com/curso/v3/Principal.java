package com.curso.v3;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V3 Lambdas");
        List<Empleado> empleados = new ArrayList<>();

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
        
        empleados.removeIf(z -> z.edad>30);
        
        empleados.forEach(emp -> System.out.println(emp));
        
	}

}
