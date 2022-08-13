package com.example.jobdemo.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data	
public class CompanyDTO {

	@JsonProperty("companyId")
	private int companyId;
	
	@JsonProperty("company")
	private String companyName;
	
	@JsonProperty("companyDescription")
	private String companyDescription;
}
