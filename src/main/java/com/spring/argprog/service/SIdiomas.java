package com.spring.argprog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.argprog.model.Idiomas;
import com.spring.argprog.repository.RIdiomas;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SIdiomas {
	
	@Autowired
	RIdiomas rIdiomas;
	
	public List<Idiomas> list(){
		return rIdiomas.findAll();
	}
	
	public Optional<Idiomas> getOne(int id){
		return rIdiomas.findById(id);
	}
	
	
	public void save(Idiomas expe) {
		rIdiomas.save(expe);
	}
	
	public void delete(int id) {
		rIdiomas.deleteById(id);
	}
	
	public boolean existById(int id) {
		return rIdiomas.existsById(id);
	}	
	

}
