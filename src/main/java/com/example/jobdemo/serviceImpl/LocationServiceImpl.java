package com.example.jobdemo.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobdemo.dto.LocationDTO;
import com.example.jobdemo.mapper.LocationMapper;
import com.example.jobdemo.model.Location;
import com.example.jobdemo.repository.LocationRepository;
import com.example.jobdemo.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService{
	
	private static final  Logger logger = LoggerFactory.getLogger(LocationServiceImpl.class);
	
	
	@Autowired
	LocationRepository locationRepository;

	public void createLocation(LocationDTO locationDTO) {
		locationRepository.save(new LocationMapper().buildLocationEntity(locationDTO));
		logger.info("Data inserted Successfully");	
		
	}

	public List<Location> getAllLocation() {
		return locationRepository.findAll();
	}

}
