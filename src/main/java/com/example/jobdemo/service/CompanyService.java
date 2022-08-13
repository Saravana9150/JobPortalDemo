package com.example.jobdemo.service;

import java.util.List;

import com.example.jobdemo.dto.CompanyDTO;
import com.example.jobdemo.model.Company;

public interface CompanyService {

	void createCompany(CompanyDTO company);

	List<Company> createCompany();

}
