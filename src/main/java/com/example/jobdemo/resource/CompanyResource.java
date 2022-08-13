package com.example.jobdemo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobdemo.dto.CompanyDTO;
import com.example.jobdemo.model.Company;
import com.example.jobdemo.service.CompanyService;

@RestController
@RequestMapping("/job")
public class CompanyResource {
	
	@Autowired
	CompanyService companyService;
	
	
	@PostMapping(path = "/saveCompany", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpStatus> saveCompany(@RequestBody CompanyDTO company)
	{
		companyService.createCompany(company);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/getAllCompany")
	public List<Company> getAllCompany()
	{
		return companyService.createCompany();
	}

}
