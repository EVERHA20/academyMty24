package com.curso.jpaData.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.jpaData.entity.Empleado;
import com.curso.jpaData.service.EmpleadoService;

@RestController
@RequestMapping("/rest")
public class EmpleadoController {

	EmpleadoService empleadoService;

	@Autowired
	public EmpleadoController(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}

	@GetMapping("/saludo")
	public String getHello() {
		return "Hello Project Spring JPA";
	}

	@GetMapping("/employees")
	public List<Empleado> findAll() {
		return empleadoService.findAllEmpleados();
	}

	@PostMapping("/employees")
	public Empleado addEmployee(@RequestBody Empleado theEmployee) {

		theEmployee.setId(0);
		Empleado dbEmployee = empleadoService.save(theEmployee);
		return dbEmployee;
	}

}
