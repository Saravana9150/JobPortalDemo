package com.example.jobdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jobdemo.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{

}
