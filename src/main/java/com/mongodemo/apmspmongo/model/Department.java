package com.mongodemo.apmspmongo.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {
	
	@Id
	private String id;
	private String name;

}
