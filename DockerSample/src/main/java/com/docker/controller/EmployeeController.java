package com.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.entity.Employee;
import com.docker.repository.EmployeeRepository;

@RestController
@RequestMapping("/dockerapp")
public class EmployeeController  {

	@Autowired
	EmployeeRepository repo;

	// Post

	@GetMapping(value="/test")
	public String test() {
		
		return "Application Runing Successfully";
		
	}
	
	@PostMapping(value = "/Employee")
	public String saveEmployee(@RequestBody Employee request) {

		try {

			repo.save(request);

			return "Success";

		}

		catch (Exception e) {

			return "Failed";
		}

	}

}
