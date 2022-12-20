package com.spring.argprog.service;

import java.util.List;

import com.spring.argprog.model.Persona;

//Declarion de lo métodos
//Se aplican en PersonaService
//Métodos de un Crud

public interface IPersonaService {
	
	public List<Persona> verPersonas();
	public void crearPersona(Persona per);
	public void borrarPersona(Long id);
	public Persona buscarPersona(Long id);

}
