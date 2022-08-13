package com.example.jobdemo.service;

import java.util.List;

import com.example.jobdemo.dto.LocationDTO;
import com.example.jobdemo.model.Location;

public interface LocationService {

	void createLocation(LocationDTO locationDTO);

	List<Location> getAllLocation();

}
