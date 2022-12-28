package com.enocaProject.demo.services.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.enocaProject.demo.dto.CompanyDTO;
import com.enocaProject.demo.entities.Company;

@Service
public interface ICompanyService {
	
	List<Company> getAllCompany();
	CompanyDTO createCompany(CompanyDTO companyDTO);
	CompanyDTO updateCompany(Long id,CompanyDTO companyDTO);
	Company delete(Long id);
	
	

}
