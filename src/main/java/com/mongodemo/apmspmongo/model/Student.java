package com.mongodemo.apmspmongo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

	@Id
	private String id;
	private String name;
	private String city;
	
	private List<String> emails;
	
	private Address address;
	
	@DBRef
	private Department department;
}
