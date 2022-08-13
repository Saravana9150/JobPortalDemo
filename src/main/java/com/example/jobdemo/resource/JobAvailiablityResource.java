package com.example.jobdemo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobdemo.dto.JobAvailabilityDTO;
import com.example.jobdemo.model.JobAvailability;
import com.example.jobdemo.service.JobAvailabiltyService;

@RestController
@RequestMapping("/job")
public class JobAvailiablityResource {
	
	
	@Autowired
	JobAvailabiltyService jobAvailabiltyService;
	
	
	@PostMapping(path = "/saveJob", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpStatus> saveJob(@RequestBody JobAvailabilityDTO jobAvailabilityDTO)
	{
		jobAvailabiltyService.createJob(jobAvailabilityDTO);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/getAllJobAvailable")
	public List<JobAvailability> getAllJobAvailable()
	{
		return jobAvailabiltyService.getAllJobAvailable();
	}

	
	

}
