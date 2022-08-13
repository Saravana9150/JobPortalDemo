package com.example.jobdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "LOCATION_DB") 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
	
	@Id
	@GeneratedValue
	private int locationId;
	
	@Column(name ="LOCATION")
	private String location;

}
