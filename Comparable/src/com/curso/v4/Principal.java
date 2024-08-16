package com.curso.v4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V4");
        // Crear un ArrayList de Empleado
        List<Empleado> empleados = new ArrayList<>();

        // Agregar 10 objetos Empleado al ArrayList
        empleados.add(new Empleado("Juan", 25, 3000.00));
        empleados.add(new Empleado("Ana", 30, 3500.00));
        empleados.add(new Empleado("Luis", 28, 3200.00));
        empleados.add(new Empleado("Sofía", 35, 4000.00));
        empleados.add(new Empleado("Carlos", 45, 5000.00));
        empleados.add(new Empleado("María", 22, 2900.00));
        empleados.add(new Empleado("Pedro", 40, 4800.00));
        empleados.add(new Empleado("Laura", 29, 3300.00));
        empleados.add(new Empleado("Andrés", 32, 3600.00));
        empleados.add(new Empleado("Elena", 27, 3100.00));

        Collections.sort(empleados);
        
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
	}

}
