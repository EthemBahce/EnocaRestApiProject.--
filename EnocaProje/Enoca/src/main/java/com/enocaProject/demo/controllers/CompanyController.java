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

import com.enocaProject.demo.dto.CompanyDTO;
import com.enocaProject.demo.entities.Company;
import com.enocaProject.demo.services.abstracts.ICompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	
	private ICompanyService companyService;

	
	@Autowired
	public CompanyController(ICompanyService companyService) {
		
		this.companyService = companyService;
	}
	
	@GetMapping("/getall")
	public List<Company> getAll(){
		return this.companyService.getAllCompany();
		
	}
	
	
	@PostMapping("/add")
	ResponseEntity<CompanyDTO> save(@Valid @RequestBody CompanyDTO companyDTO){
		return ResponseEntity.ok(this.companyService.createCompany(companyDTO));
	}
	
	
	
	@PutMapping("/update/{id}")
	ResponseEntity<CompanyDTO> update(@PathVariable("id") Long id , @Valid @RequestBody CompanyDTO companyDTO){
		return ResponseEntity.ok(this.companyService.updateCompany(id, companyDTO));
	}
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<Company> delete(@Valid @PathVariable("id") Long id){
		return ResponseEntity.ok(this.companyService.delete(id));
	}
	
	
	
	
	

}
