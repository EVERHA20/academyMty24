package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		String insert = """
				insert into employees 
				(last_name, first_name, email, department, salary)  
				values 
				('Wright', 'Eric', 'eric.wright@foo.com', 'HR', 33000.00)
				""";
		
		System.out.println(insert);
	}

}
