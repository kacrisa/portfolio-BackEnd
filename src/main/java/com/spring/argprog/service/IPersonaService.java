package com.spring.argprog.service;

import java.util.List;

import com.spring.argprog.model.Persona;

//Declarion de lo métodos
//Se aplican en PersonaService
//Métodos de un Crud

public interface IPersonaService {
	
	public void crearPersona(Persona per);
	public List<Persona> verPersonas();
	public Persona buscarPersona(Long id);
	public void borrarPersona(Long id);

}
