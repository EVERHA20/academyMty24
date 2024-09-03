package com.curso.jpaData.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curso.jpaData.entity.Empleado;

//SPRING DATA JPA
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
	
	

}
