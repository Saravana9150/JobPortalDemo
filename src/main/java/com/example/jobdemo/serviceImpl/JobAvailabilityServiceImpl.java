package com.example.jobdemo.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobdemo.dto.JobAvailabilityDTO;
import com.example.jobdemo.mapper.JobAvailabilityMapper;
import com.example.jobdemo.model.JobAvailability;
import com.example.jobdemo.repository.JobAvailabilityRepository;
import com.example.jobdemo.service.JobAvailabiltyService;

@Service
public class JobAvailabilityServiceImpl implements JobAvailabiltyService{
	
	private static final  Logger logger = LoggerFactory.getLogger(JobAvailabilityServiceImpl.class);
	
	@Autowired
	JobAvailabilityRepository jobAvailabilityRepository;

	public void createJob(JobAvailabilityDTO jobAvailabilityDTO) {
		
          jobAvailabilityRepository.save(new JobAvailabilityMapper().buildJobEntity(jobAvailabilityDTO));
		logger.info("Data inserted Successfully");	
		
	}

	public List<JobAvailability> getAllJobAvailable() {
		return jobAvailabilityRepository.findAll();
	}

}
