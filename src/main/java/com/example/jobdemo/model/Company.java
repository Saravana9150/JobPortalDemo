package com.example.jobdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "COMPANY_DB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
	
	@Id
	@GeneratedValue
	private int companyId;
	
	@Column(name ="COMPANY_NAME")
	private String companyName;
	
	@Column(name ="COMPANY_DESCRIPTION")
	private String companyDescription;
}
