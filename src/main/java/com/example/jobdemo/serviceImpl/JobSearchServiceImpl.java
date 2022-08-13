package com.example.jobdemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobdemo.dto.JobSearchResponse;
import com.example.jobdemo.repository.JobAvailabilityRepository;
import com.example.jobdemo.service.JobSearchService;

@Service
public class JobSearchServiceImpl implements JobSearchService {
	
	@Autowired
	JobAvailabilityRepository jobAvailabilityRepository;

	@Override
	public List<JobSearchResponse> getMatchedJob(JobSearchResponse jobSearchResponse) {
		
		return jobAvailabilityRepository.getSearchQuery(jobSearchResponse.getCompanyName(),jobSearchResponse.getExperienceNeeded(),
				jobSearchResponse.getSkill(), jobSearchResponse.getLocation());
	}
}
