package com.spring.argprog.service;

import java.util.List;

import com.spring.argprog.model.Persona;

//Declarion de lo métodos
//Se aplican en PersonaService
//Métodos de un Crud

public interface IPersonaService {
	
	//Crear y actualiza
	public void crearPersona(Persona per);
	
	//Trae lista de personas
	public List<Persona> verPersonas();
	
	//Busca persona
	public Persona buscarPersona(Long id);
	
	//Elimina
	public void borrarPersona(Long id);

}
