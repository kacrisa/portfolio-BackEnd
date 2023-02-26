package com.spring.argprog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.argprog.model.Habilidades;
import com.spring.argprog.repository.RHabilidades;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SHabilidades {
	
	@Autowired
	RHabilidades rHabilidades;
	
	public List<Habilidades> list(){
		return rHabilidades.findAll();
	}
	
	public Optional<Habilidades> getOne(int id){
		return rHabilidades.findById(id);
	}
	
	
	public void save(Habilidades expe) {
		rHabilidades.save(expe);
	}
	
	public void delete(int id) {
		rHabilidades.deleteById(id);
	}
	
	public boolean existById(int id) {
		return rHabilidades.existsById(id);
	}

}
