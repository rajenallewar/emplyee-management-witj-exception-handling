package com.syne.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syne.api.exception.EmployeeNotFoundException;
import com.syne.api.model.Employee;
import com.syne.api.repository.EmployeeRepository;
import com.syne.api.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Override
	public Employee getEmployeeById(long employeeId) throws EmployeeNotFoundException {
		Optional<Employee> employee = repository.findById(employeeId);

		if (employee.isPresent()) {
			return employee.get();
		} else {
			throw new EmployeeNotFoundException("No employee record exist for given employee id");
		}

	}

	@Override
	public Employee createOrUpdateEmployee(Employee employee) throws EmployeeNotFoundException {
		if(employee != null) {
			double grossSalary = employee.getSalary() * employee.getBonusPercentage();
			employee.setGrossSalary(grossSalary);
		}
		Employee newEmployee = repository.save(employee);
		return newEmployee;
	}

}
