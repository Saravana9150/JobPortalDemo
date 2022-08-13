package com.example.jobdemo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobdemo.dto.JobSearchResponse;
import com.example.jobdemo.service.JobSearchService;

@RestController
@RequestMapping("/job")
public class JobSearchResource {
	
	@Autowired
	JobSearchService  jobSearchService;
	
	
	@PostMapping(path ="/jobSearch", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<JobSearchResponse>  getMatchedJob(@RequestBody JobSearchResponse jobSearchResponse){
		return jobSearchService.getMatchedJob(jobSearchResponse);
	}
	
	

}
