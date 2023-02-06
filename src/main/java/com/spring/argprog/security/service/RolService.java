package com.spring.argprog.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.argprog.security.entity.Rol;
import com.spring.argprog.security.enums.RolNombre;
import com.spring.argprog.security.repository.iRolRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RolService {
	@Autowired
	iRolRepository irolRepository;
	
	public Optional<Rol> getByRolNombre(RolNombre rolNombre){
		return irolRepository.findByRolNombre(rolNombre);
	}
	
	public void save(Rol rol) {
		irolRepository.save(rol);
	}
	

}
