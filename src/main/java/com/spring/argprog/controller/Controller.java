package com.spring.argprog.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.argprog.model.Persona;
import com.spring.argprog.service.IPersonaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
public class Controller {
	
	//Injeccion de depencia:
	@Autowired
	
	//Implementacion de la interface:
	private IPersonaService persoServ;
	
	
    //Requerimientos con POST - Ya con DB
    
    @PostMapping("/new/persona")
    public void agregaPersona (@RequestBody Persona pers) {
    	persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
    	return persoServ.verPersonas();    
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
    	persoServ.borrarPersona(id);
    }

}

