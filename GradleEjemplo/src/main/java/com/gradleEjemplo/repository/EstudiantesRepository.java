package com.gradleEjemplo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.gradleEjemplo.model.EstudianteModel;

public interface EstudiantesRepository extends MongoRepository<EstudianteModel, String>{
	
	@Query("{nombre:'?0'}")
	EstudianteModel findByName(String name);
	
}
