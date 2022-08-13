package com.example.jobdemo.mapper;
import com.example.jobdemo.dto.SkillDTO;
import com.example.jobdemo.model.Skill;

public class SkillMapper {
	
	public Skill buildSkillEntity(SkillDTO skillDTO)
	{
		Skill skill = new Skill();
		skill.setSkillName(skillDTO.getSkillName());
		return skill;
	}

}
