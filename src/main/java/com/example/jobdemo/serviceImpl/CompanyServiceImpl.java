package com.example.jobdemo.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobdemo.dto.CompanyDTO;
import com.example.jobdemo.mapper.CompanyMapper;
import com.example.jobdemo.model.Company;
import com.example.jobdemo.repository.CompanyRepository;
import com.example.jobdemo.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	private static final  Logger logger = LoggerFactory.getLogger(CompanyServiceImpl.class);
	
	@Autowired
	CompanyRepository companyRepository;

	public void createCompany(CompanyDTO company) {
		companyRepository.save(new CompanyMapper().buildCompanyEntity(company));
		logger.info("Data inserted Successfully");	
	}

	public List<Company> createCompany() {
		return companyRepository.findAll();	
	}

}
