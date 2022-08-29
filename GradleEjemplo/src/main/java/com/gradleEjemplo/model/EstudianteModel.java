package com.gradleEjemplo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document("Estudiantes")
public class EstudianteModel {

	@Id
	private String id;
	
	private String nombre;
	
	private String apellido;
	
	private String grado;
	
	private String acudiente;
}
