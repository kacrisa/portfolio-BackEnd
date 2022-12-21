package com.spring.argprog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.argprog.model.Persona;
import com.spring.argprog.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	public PersonaRepository persoRepo;
	
	@Override
	public List<Persona> verPersonas() {
		return persoRepo.findAll();
		
	}

	@Override
	public void crearPersona(Persona per) {
		persoRepo.save(per);
		
	}

	@Override
	public void borrarPersona(Long id) {
		persoRepo.deleteById(id);
		
	}

	@Override
	public Persona buscarPersona(Long id) {
		return persoRepo.findById(id).orElse(null);
	}

}
