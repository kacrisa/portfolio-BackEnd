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

import com.spring.argprog.dto.dtoEducacion;
import com.spring.argprog.model.Educacion;
import com.spring.argprog.security.controller.Mensaje;
import com.spring.argprog.service.SEducacion;

@RequestMapping("/educacion")
@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://portf-kacrisa.web.app/"})

public class CEducacion {

	@Autowired
	SEducacion sEducacion;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Educacion>> list(){
		List<Educacion> list = sEducacion.list();
		return new ResponseEntity(list, HttpStatus.OK);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<?> create(@RequestBody dtoEducacion dtoEdu){
			
		Educacion educacion = new Educacion(dtoEdu.getEscuelaE(), dtoEdu.getTituloE(), dtoEdu.getDataE(), dtoEdu.getDescripcionE(), dtoEdu.getImagenE());
		educacion.setId(dtoEdu.getId());
		sEducacion.save(educacion);
		
		return new ResponseEntity(new Mensaje("Educacion creada/actualizada"), HttpStatus.OK);
	}

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
      
    	sEducacion.delete(id);
        return new ResponseEntity(new Mensaje("La info de educación fue eliminada correctamente!"), HttpStatus.OK);
    }
    
}
