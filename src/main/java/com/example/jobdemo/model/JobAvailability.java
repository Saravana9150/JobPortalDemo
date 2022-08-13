package com.example.jobdemo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "JOB_AVAILABILITY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAvailability {
	
	@Id
	@GeneratedValue
	private int jobId;
	
	@Column(name = "experience")
	private int experience;
	
	@Column(name = "jobDescription")
	private String jobDescription;
	
	@ManyToOne
	@JoinColumn(name = "skillId")
	private Skill skill;
	
	@ManyToOne
	@JoinColumn(name = "locationId")
	private Location location;
	
	@ManyToOne
	@JoinColumn(name = "companyId")
	private Company company;

}
