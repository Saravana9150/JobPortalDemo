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

import com.example.jobdemo.dto.SkillDTO;
import com.example.jobdemo.model.Skill;
import com.example.jobdemo.service.SkillService;

@RestController
@RequestMapping("/job")
public class SkillResource {
	
	
	@Autowired
	SkillService skillService;
	
	
	@PostMapping(path = "/saveSkill", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpStatus> saveSkill(@RequestBody SkillDTO jobRoleDTO)
	{
		skillService.createSkill(jobRoleDTO);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/getAllSkill")
	public List<Skill> getAllSkill()
	{
		return skillService.getAllSkill();
	}

}
