package com.mongodemo.apmspmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodemo.apmspmongo.model.Student;

public interface StudentRepository extends MongoRepository<Student, String>{

}
