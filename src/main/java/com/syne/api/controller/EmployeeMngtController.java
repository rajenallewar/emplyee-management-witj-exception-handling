package com.syne.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.syne.api.exception.EmployeeNotFoundException;
import com.syne.api.model.Employee;
import com.syne.api.service.EmployeeService;

@Controller
public class EmployeeMngtController {

	@Autowired
	EmployeeService employeeService;

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") String id) throws EmployeeNotFoundException {
		Employee entity = employeeService.getEmployeeById(Long.parseLong(id));
		return new ResponseEntity<Employee>(entity, new HttpHeaders(), HttpStatus.OK);
	}

//	@PostMapping
	@PostMapping(value = "/employees")
	public ResponseEntity<Employee> createOrUpdateEmployee(@RequestBody Employee employee) throws EmployeeNotFoundException {
		employeeService.createOrUpdateEmployee(employee);
	    	Employee updated = employeeService.createOrUpdateEmployee(employee);
	        return new ResponseEntity<Employee>(updated, new HttpHeaders(), HttpStatus.OK);
	}

}
