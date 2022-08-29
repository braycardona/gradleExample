package com.gradleEjemplo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gradleEjemplo.service.EstudianteService;


@RestController
@RequestMapping("/estudiante")
public class EstudiantesController {
	
	@Autowired
	EstudianteService estudianteService;
	


	
	public ResponseEntity<?> listarEstudiantes()  {
		return new ResponseEntity<>(estudianteService.Listar(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/buscar/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> buscarEstudiante(@RequestParam String nombre)  {
		return new ResponseEntity<>(estudianteService.buscarEstudiante(nombre), HttpStatus.OK);
	}
	

}
