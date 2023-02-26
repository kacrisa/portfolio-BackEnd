//Implementacion del IPersonaService

package com.spring.argprog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.argprog.model.Persona;
import com.spring.argprog.repository.RPersona;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SPersona {

	@Autowired
	RPersona persoRepo;
	
	public List<Persona> list() {
		return persoRepo.findAll();
		
	}
	
	public void crearPersona(Persona per) {
		persoRepo.save(per);
		
	}


	public Persona buscarPersona(Long id) {
		return persoRepo.findById(id).orElse(null);
	}
	
	
	public void borrarPersona(Long id) {
		persoRepo.deleteById(id);
		
	}
	

}
