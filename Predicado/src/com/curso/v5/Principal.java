package com.curso.v5;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V5");
		
		List<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new Empleado("Filologo", 25, 300.0));
        listaEmpleados.add(new Empleado("Epenetox", 17, 6000.0));
        listaEmpleados.add(new Empleado("Juan", 40, 4200.0));
        listaEmpleados.add(new Empleado("Ana", 28, 3100.0));
        listaEmpleados.add(new Empleado("Luis", 35, 3800.0));
        listaEmpleados.add(new Empleado("Elena", 23, 2700.0));
        listaEmpleados.add(new Empleado("Pedro", 45, 4500.0));
        listaEmpleados.add(new Empleado("Sofia", 32, 3300.0));
        listaEmpleados.add(new Empleado("Miguel", 29, 3000.0));
        listaEmpleados.add(new Empleado("Laura", 27, 2800.0));
        listaEmpleados.add(new Empleado("Ricardo", 50, 4800.0));
        listaEmpleados.add(new Empleado("Sara", 24, 2600.0));
        listaEmpleados.add(new Empleado("Javier", 38, 3700.0));
        listaEmpleados.add(new Empleado("Paula", 31, 3200.0));
        listaEmpleados.add(new Empleado("Roberto", 42, 4100.0));
        listaEmpleados.add(new Empleado("Cristina", 26, 2900.0));
        listaEmpleados.add(new Empleado("Andres", 33, 3400.0));
        listaEmpleados.add(new Empleado("Patricia", 36, 3600.0));
        listaEmpleados.add(new Empleado("Fernando", 48, 4600.0));
        listaEmpleados.add(new Empleado("Monica", 22, 2500.0));
        listaEmpleados.add(new Empleado("Carlos", 30, 3500.0));
        listaEmpleados.add(new Empleado("Maria", 25, 2900.0));

		
		Predicado<Empleado> pre1 = e -> e.edad > 35;
		Predicado<Empleado> pre2 = t -> t.sueldo > 3500;
		
		Predicado<Empleado> preRes = pre1.and(pre2);
		show(listaEmpleados,preRes);
		
		System.out.println("***************");
		
		preRes = pre1.or(pre2);
		show(listaEmpleados,preRes);
		
		System.out.println("***************");
		
		preRes = pre2.negate();
		show(listaEmpleados,preRes);
	}
	
	static void show(List<Empleado> listaEmp, 
			Predicado<Empleado> pre) {
		
		for (Empleado e:listaEmp)
			if (pre.probar(e))
				System.out.println(e);
	}

}
