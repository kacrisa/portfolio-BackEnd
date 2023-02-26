package com.spring.argprog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.argprog.model.Proyectos;
import com.spring.argprog.repository.RProyectos;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SProyectos {
	
	@Autowired
	RProyectos rProyectos;
	
	public List<Proyectos> list(){
		return rProyectos.findAll();
	}
	
	public Optional<Proyectos> getOne(int id){
		return rProyectos.findById(id);
	}
	
	
	public void save(Proyectos proye) {
		rProyectos.save(proye);
	}
	
	public void delete(int id) {
		rProyectos.deleteById(id);
	}
	
	public boolean existById(int id) {
		return rProyectos.existsById(id);
	}

}
