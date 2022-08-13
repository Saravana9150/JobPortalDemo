package com.example.jobdemo.service;

import java.util.List;

import com.example.jobdemo.dto.JobSearchResponse;

public interface JobSearchService {

	List<JobSearchResponse> getMatchedJob(JobSearchResponse jobSearchResponse);

}
