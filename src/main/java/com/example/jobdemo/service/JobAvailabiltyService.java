package com.example.jobdemo.service;

import java.util.List;

import com.example.jobdemo.dto.JobAvailabilityDTO;
import com.example.jobdemo.model.JobAvailability;

public interface JobAvailabiltyService {

	void createJob(JobAvailabilityDTO jobAvailabilityDTO);

	List<JobAvailability> getAllJobAvailable();

}
