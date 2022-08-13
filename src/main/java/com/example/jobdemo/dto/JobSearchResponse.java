package com.example.jobdemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSearchResponse {
	
	@JsonProperty(value = "companyName")
	private String companyName;
	
	@JsonProperty(value = "experienceNeeded")
	private int experienceNeeded;
	
	@JsonProperty(value = "skill")
	private String skill;
	
	@JsonProperty(value = "location")
	private String location;

	@JsonProperty(value = "companyDescription")
	private String companyDescription;
	
	@JsonProperty("jobDescription")
	private String jobDescription;
	
}
