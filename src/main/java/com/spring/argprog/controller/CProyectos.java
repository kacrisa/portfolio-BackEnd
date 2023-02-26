package com.spring.argprog.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.spring.argprog.dto.dtoProyectos;
import com.spring.argprog.model.Proyectos;
import com.spring.argprog.security.controller.Mensaje;
import com.spring.argprog.service.SProyectos;

@RequestMapping("/proyectos")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CProyectos {
	
	@Autowired
	SProyectos sProyectos;

	@GetMapping("/listar")
	public ResponseEntity<List<Proyectos>> list(){
		List<Proyectos> list = sProyectos.list();
		return new ResponseEntity(list, HttpStatus.OK);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<?> create(@RequestBody dtoProyectos dtoProy){
			
		Proyectos Proyectos = new Proyectos(dtoProy.getNombreP(), dtoProy.getFechaP(), dtoProy.getDescripcionP(), dtoProy.getImagenP());
		Proyectos.setId(dtoProy.getId());
		sProyectos.save(Proyectos);
		
		return new ResponseEntity(new Mensaje("Proyecto agregado/actualizado"), HttpStatus.OK);
	}

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
      
        sProyectos.delete(id);
        return new ResponseEntity(new Mensaje("Proyecto eliminado correctamente!"), HttpStatus.OK);
    }
    
}
