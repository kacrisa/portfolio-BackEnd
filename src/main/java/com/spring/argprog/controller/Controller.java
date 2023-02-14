package com.spring.argprog.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.argprog.model.Persona;
import com.spring.argprog.service.IPersonaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

//Creando un @Controller
    //El nuevo paquete creado representará la capa controladora del proyecto

// Injeccion de dependencias
	//Controladora conectada al servicio
	//El servicio conectado al repo
	//Repo conectada a la DB

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
	
	//Injeccion de depencia:
	@Autowired
	
	//Implementacion de la interface:
	private IPersonaService persoServ;
	
	
    //Requerimientos con POST - Ya con DB
    
	@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String crearPersona (@RequestBody Persona pers) {
    	persoServ.crearPersona(pers);
    	return "La persona fue creada/actualizada correctamente!";
    }
    
    @GetMapping ("/personas/traer")
    @ResponseBody
    public List<Persona> verPersonas(){
    	return persoServ.verPersonas();    
    }
    
    @GetMapping ("/personas/buscar/{id}")
    public Persona buscarPersona(@PathVariable Long id){
    	return persoServ.buscarPersona(id);    
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/personas/borrar/{id}")
    public String borrarPersona (@PathVariable Long id) {
    	persoServ.borrarPersona(id);
    	return "La persona fue eliminada correctamente!";
    }
    
    @GetMapping ("/personas/buscar/perfil")
    public Persona buscarPersona(){
    	return persoServ.buscarPersona((long)1);    
    }

}

