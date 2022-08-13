package com.example.jobdemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class JobAvailabilityDTO {
	
	@JsonProperty("jobId")
	private int jobId;
	
	@JsonProperty("experience")
	private int experience;
	
	@JsonProperty("jobDescription")
	private String jobDescription;
	
	@JsonProperty("skillId")
	private int skillId;
	
	@JsonProperty("locationId")
	private int locationId;

	@JsonProperty("companyId")
	private int companyId;

}
