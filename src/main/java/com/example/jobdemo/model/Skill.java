package com.example.jobdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SKILL_DB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
	
	@Id
	@GeneratedValue
	private int skillId;
	
	@Column(name ="SkillName")
	private String skillName;

}
