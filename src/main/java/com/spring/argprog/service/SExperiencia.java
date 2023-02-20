package com.spring.argprog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.argprog.model.Experiencia;
import com.spring.argprog.repository.RExperiencia;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SExperiencia {
	@Autowired
	RExperiencia rExperiencia;
	
	public List<Experiencia> list(){
		return rExperiencia.findAll();
	}
	
	public Optional<Experiencia> getOne(int id){
		return rExperiencia.findById(id);
	}
	
	
	public void save(Experiencia expe) {
		rExperiencia.save(expe);
	}
	
	public void delete(int id) {
		rExperiencia.deleteById(id);
	}
	
	public boolean existById(int id) {
		return rExperiencia.existsById(id);
	}
	

}
