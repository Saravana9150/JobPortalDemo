package com.example.jobdemo.mapper;

import com.example.jobdemo.dto.JobAvailabilityDTO;
import com.example.jobdemo.model.Company;
import com.example.jobdemo.model.JobAvailability;
import com.example.jobdemo.model.Location;
import com.example.jobdemo.model.Skill;

public class JobAvailabilityMapper {
	
	public JobAvailability buildJobEntity(JobAvailabilityDTO jobAvailabilityDTO) {
		JobAvailability jobAvailability = new JobAvailability();
		jobAvailability.setExperience(jobAvailabilityDTO.getExperience());
		jobAvailability.setJobDescription(jobAvailabilityDTO.getJobDescription());
		jobAvailability.setSkill(new Skill(jobAvailabilityDTO.getSkillId(),null));
		jobAvailability.setLocation(new Location(jobAvailabilityDTO.getLocationId(),null));
		jobAvailability.setCompany(new Company(jobAvailabilityDTO.getCompanyId(),null,null));
		return jobAvailability;
	}

}
