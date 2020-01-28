package com.syne.api.service;

import com.syne.api.exception.EmployeeNotFoundException;
import com.syne.api.model.Employee;

public interface EmployeeService {
	
	public Employee getEmployeeById(long employeeId) throws EmployeeNotFoundException;
	
	public Employee createOrUpdateEmployee(Employee employee) throws EmployeeNotFoundException;

}
