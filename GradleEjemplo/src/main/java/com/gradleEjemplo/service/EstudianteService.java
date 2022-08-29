package com.gradleEjemplo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gradleEjemplo.model.EstudianteModel;
import com.gradleEjemplo.repository.EstudiantesRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EstudianteService {

	@Autowired
	private EstudiantesRepository estudiantesRepository;
	
	public List<EstudianteModel> Listar(){
		return estudiantesRepository.findAll();
	}
	
	public EstudianteModel buscarEstudiante(String nombre) {
		return estudiantesRepository.findByName(nombre);
	}
}
