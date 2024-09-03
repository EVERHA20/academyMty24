package com.curso.jpaData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curso.jpaData.dao.EmpleadoRepository;
import com.curso.jpaData.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	EmpleadoRepository empleadoRespository;
	
	@Autowired
	public EmpleadoServiceImpl(EmpleadoRepository empleadoRespository) {
		this.empleadoRespository = empleadoRespository;
	}

	@Override
	public List<Empleado> findAllEmpleados() {
		return empleadoRespository.findAll();
	}

	@Override
	public Empleado save(Empleado theEmployee) {
		return empleadoRespository.save(theEmployee);
	}
	
	
	
}
