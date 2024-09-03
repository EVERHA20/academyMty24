package com.curso.jpaData.service;

import java.util.List;
import com.curso.jpaData.entity.Empleado;

public interface EmpleadoService {
	
	List<Empleado> findAllEmpleados();

	Empleado save(Empleado theEmployee); 

}
