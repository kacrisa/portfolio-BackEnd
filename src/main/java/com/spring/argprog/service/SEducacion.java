package com.spring.argprog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.argprog.model.Educacion;
import com.spring.argprog.repository.REducacion;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SEducacion {
	
	@Autowired
	REducacion rEducacion;
	
	public List<Educacion> list(){
		return rEducacion.findAll();
	}
	
	public Optional<Educacion> getOne(int id){
		return rEducacion.findById(id);
	}
	
	
	public void save(Educacion expe) {
		rEducacion.save(expe);
	}
	
	public void delete(int id) {
		rEducacion.deleteById(id);
	}
	
	public boolean existById(int id) {
		return rEducacion.existsById(id);
	}
	
	

}
