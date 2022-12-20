package com.spring.argprog.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.argprog.model.Persona;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//Creando un @Controller
    //El nuevo paquete creado representará la capa controladora del proyecto

@RestController
public class Controller {
	
    List<Persona> listaPersonas = new ArrayList<Persona>();
    
	//Requerimientos con GET

    @GetMapping("/")
    public String decirHola(){

        return "Hello Word";
    }

    @GetMapping ("/hole")
    public String decirHole(){

        return "Hello Worde";
    }
    
    @GetMapping ("/holi/{nombre}")
    public String decirHoli(@PathVariable String nombre){

        return "Hello Wordi " + nombre;
    }
    
    @GetMapping ("/holo/{nombre}/{edad}/{profesion}")
    public String decirHolo(@PathVariable String nombre,
                            @PathVariable int edad,
                            @PathVariable String profesion) {

        return "Hello Wordo. Tu nombre es: " + nombre +
        ". Tu edad es: " + edad + ". Tu profesión es: " + profesion;
    }
    
    @GetMapping ("/holu")
    public String decirHolu(@RequestParam String nombre,
                            @RequestParam int edad,
                            @RequestParam String profesion) {

        return "Hello Wordo. Tu nombre es: " + nombre +
        ". Tu edad es: " + edad + ". Tu profesión es: " + profesion;
    }
    
    //Requerimientos con POST
    
    @PostMapping("/new/persona")
    public void agregaPersona (@RequestBody Persona pers) {
    	listaPersonas.add(pers);
    }
    
    @GetMapping ("ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
    	return listaPersonas;
    }

}

