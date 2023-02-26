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

import com.spring.argprog.dto.dtoIdiomas;
import com.spring.argprog.model.Idiomas;
import com.spring.argprog.security.controller.Mensaje;
import com.spring.argprog.service.SIdiomas;

@RequestMapping("/idiomas")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CIdiomas {
	
	@Autowired
	SIdiomas sIdiomas;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Idiomas>> list(){
		List<Idiomas> list = sIdiomas.list();
		return new ResponseEntity(list, HttpStatus.OK);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<?> create(@RequestBody dtoIdiomas dtoIdi){
			
		Idiomas Idiomas = new Idiomas(dtoIdi.getNombreI(), dtoIdi.getNivelI(), dtoIdi.getPorcentajeI());
		Idiomas.setId(dtoIdi.getId());
		sIdiomas.save(Idiomas);
		
		return new ResponseEntity(new Mensaje("Idioma creado/actualizado"), HttpStatus.OK);
	}

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
      
        sIdiomas.delete(id);
        return new ResponseEntity(new Mensaje("Idioma eliminado correctamente!"), HttpStatus.OK);
    }
}
