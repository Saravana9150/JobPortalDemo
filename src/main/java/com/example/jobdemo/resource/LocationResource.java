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
import com.example.jobdemo.dto.LocationDTO;
import com.example.jobdemo.model.Location;
import com.example.jobdemo.service.LocationService;

@RestController
@RequestMapping("/job")
public class LocationResource {
	
	@Autowired
	LocationService locationService;
	
	@PostMapping(path = "/saveLocation", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpStatus> saveJobRole(@RequestBody LocationDTO locationDTO)
	{
		locationService.createLocation(locationDTO);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/getAllLocation")
	public List<Location> getAllJobRole()
	{
		return locationService.getAllLocation();
	}

}
