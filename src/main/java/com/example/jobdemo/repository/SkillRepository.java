package com.example.jobdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jobdemo.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{

}
