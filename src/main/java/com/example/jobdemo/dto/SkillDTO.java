package com.example.jobdemo.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SkillDTO {
	
	@JsonProperty("skillId")
	private int skillId;
	
	@JsonProperty("skill")
	private String skillName;

}
