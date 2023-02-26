package com.spring.argprog.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.argprog.dto.dtoPersona;

import com.spring.argprog.model.Persona;
import com.spring.argprog.security.controller.Mensaje;
import com.spring.argprog.service.SPersona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//Creando un @Controller
    //El nuevo paquete creado representará la capa controladora del proyecto

// Injeccion de dependencias
	//Controladora conectada al servicio
	//El servicio conectado al repo
	//Repo conectada a la DB

@RequestMapping("/persona")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
	
	//Injeccion de depencia:
	@Autowired
	SPersona persoServ;
    
    @GetMapping ("/listar")

	public ResponseEntity<List<Persona>> list(){
		List<Persona> list = persoServ.list();
		return new ResponseEntity(list, HttpStatus.OK);
	}
    
    @PostMapping("/crear")
    public ResponseEntity<?> crearPersona (@RequestBody dtoPersona pers) {
    	
		Persona Persona = new Persona(pers.getNombre(), pers.getApellido(), pers.getCiudad(), pers.getPosicion(), pers.getBio(), pers.getImage(), pers.getBackImage());
		Persona.setId(pers.getId());
		persoServ.crearPersona(Persona);
		
		return new ResponseEntity(new Mensaje("Persona creada/actualizada"), HttpStatus.OK);
    }
    
    
    @DeleteMapping ("/borrar/{id}")
    public String borrarPersona (@PathVariable Long id) {
    	persoServ.borrarPersona(id);
    	return "La persona fue eliminada correctamente!";
    }
    
    @GetMapping ("/buscar/perfil")
    public Persona buscarPersona(){
    	return persoServ.buscarPersona((long)1);    
    }

}

