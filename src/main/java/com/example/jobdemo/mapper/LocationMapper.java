package com.example.jobdemo.mapper;

import com.example.jobdemo.dto.LocationDTO;
import com.example.jobdemo.model.Location;

public class LocationMapper {
	
	public Location buildLocationEntity(LocationDTO locationDTO) {
		Location location = new Location();
		location.setLocation(locationDTO.getLocation());
		return location;
	}

}
