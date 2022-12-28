package com.enocaProject.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enocaProject.demo.dto.EmployeeDTO;
import com.enocaProject.demo.entities.Employee;
import com.enocaProject.demo.services.abstracts.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private IEmployeeService employeeService;
	
	@Autowired
	public EmployeeController(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return this.employeeService.getAllEmployee();
		
	}
	
	
	@PostMapping("/add")
	ResponseEntity<EmployeeDTO> save(@Valid @RequestBody EmployeeDTO employeeDTO){
		
		
		return ResponseEntity.ok(this.employeeService.createEmployee(employeeDTO));
	}
	
	
	
	@PutMapping("/update/{id}")
	ResponseEntity<EmployeeDTO> update(@PathVariable("id") Long id , @Valid @RequestBody EmployeeDTO employeeDTO){
		return ResponseEntity.ok(this.employeeService.updateEmployee(id, employeeDTO));
	}
	
	
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<Employee> delete(@Valid @PathVariable("id") Long id){
		return ResponseEntity.ok(this.employeeService.delete(id));
	}
	
	
	

}
