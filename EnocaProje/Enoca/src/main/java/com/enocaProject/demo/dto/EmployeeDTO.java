package com.enocaProject.demo.dto;

import com.enocaProject.demo.entities.Company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDTO {
	
	private Long id;
	
	private String name;
	
	private String lastName;
	
	private Company company;

}
