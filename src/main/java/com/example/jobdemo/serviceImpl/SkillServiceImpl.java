package com.example.jobdemo.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobdemo.dto.SkillDTO;
import com.example.jobdemo.mapper.SkillMapper;
import com.example.jobdemo.model.Skill;
import com.example.jobdemo.repository.SkillRepository;
import com.example.jobdemo.service.SkillService;


@Service
public class SkillServiceImpl implements SkillService{
	
	private static final  Logger logger = LoggerFactory.getLogger(SkillServiceImpl.class);
	
	@Autowired
	SkillRepository jobRoleRepository;

	public void createSkill(SkillDTO jobRoleDTO) {
		jobRoleRepository.save(new SkillMapper().buildSkillEntity(jobRoleDTO));
		logger.info("Data inserted Successfully");	
		
	}

	public List<Skill> getAllSkill() {
		return jobRoleRepository.findAll();	
	}

}
