package com.spring.argprog.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.argprog.model.Persona;
import com.spring.argprog.service.IPersonaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
    
    @PostMapping("api/personas")
    public void crearPersona (@RequestBody Persona pers) {
    	persoServ.crearPersona(pers);
    }
    
    @GetMapping ("api/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
    	return persoServ.verPersonas();    
    }
    
    @GetMapping ("api/personas/{id}")
    public Persona buscarPersona(@PathVariable Long id){
    	return persoServ.buscarPersona(id);    
    }
    
    @DeleteMapping ("api/personas/{id}")
    public void borrarPersona (@PathVariable Long id) {
    	persoServ.borrarPersona(id);
    }

}

