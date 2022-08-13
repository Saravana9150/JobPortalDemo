package com.example.jobdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.jobdemo.dto.JobSearchResponse;
import com.example.jobdemo.model.JobAvailability;

@Repository
public interface JobAvailabilityRepository extends JpaRepository<JobAvailability,Integer>{
	
	@Query("select new com.example.jobdemo.dto.JobSearchResponse(ja.company.companyName,ja.experience,ja.skill.skillName, "
			+ "ja.location.location,ja.company.companyDescription,ja.jobDescription) from JobAvailability ja" +
			" left join Skill s on s.skillId = ja.skill.skillId" +
			" left join Location l on l.locationId = ja.location.locationId" +
			" left join Company c on c.companyId = ja.company.companyId" + 
			" where ja.company.companyName = :companyName and ja.skill.skillName = :skill" +
			" and ja.experience = :experience and ja.location.location = :location")
	List<JobSearchResponse> getSearchQuery(String companyName,int experience,String skill, String location);
}
