package com.example.jobdemo.mapper;

import com.example.jobdemo.dto.CompanyDTO;
import com.example.jobdemo.model.Company;

public class CompanyMapper {
	
	
	public Company buildCompanyEntity(CompanyDTO companyDTO)
	{
		Company company = new Company();
		company.setCompanyName(companyDTO.getCompanyName());
		company.setCompanyDescription(companyDTO.getCompanyDescription());
		return company;
	}

}
