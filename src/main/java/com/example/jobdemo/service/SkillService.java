package com.example.jobdemo.service;

import java.util.List;

import com.example.jobdemo.dto.SkillDTO;
import com.example.jobdemo.model.Skill;

public interface SkillService {

	void createSkill(SkillDTO jobRoleDTO);

	List<Skill> getAllSkill();

}
