package com.enocaProject.demo.services.abstracts;

import java.util.List;

import com.enocaProject.demo.dto.EmployeeDTO;
import com.enocaProject.demo.entities.Employee;

public interface IEmployeeService {
	
	List<Employee> getAllEmployee();
	EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
	EmployeeDTO updateEmployee(Long id,EmployeeDTO employeeDTO);
	Employee delete(Long id);

}
