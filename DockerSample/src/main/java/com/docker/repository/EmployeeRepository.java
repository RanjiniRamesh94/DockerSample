package com.docker.repository;

import org.springframework.data.repository.CrudRepository;

import com.docker.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	
	
}
