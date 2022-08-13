package com.example.jobdemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LocationDTO {
	
	@JsonProperty("locationId")
    private int locationId;
    
    @JsonProperty("location")
	private String location;

}
