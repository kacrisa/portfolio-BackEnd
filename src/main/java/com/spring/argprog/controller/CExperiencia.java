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

import com.spring.argprog.dto.dtoExperiencia;
import com.spring.argprog.model.Experiencia;
import com.spring.argprog.security.controller.Mensaje;
import com.spring.argprog.service.SExperiencia;


@RequestMapping("/experiencia")
@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://portf-kacrisa.web.app/"})

public class CExperiencia {
	
	@Autowired
	SExperiencia sExperiencia;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Experiencia>> list(){
		List<Experiencia> list = sExperiencia.list();
		return new ResponseEntity(list, HttpStatus.OK);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoExp){
			
		Experiencia experiencia = new Experiencia(dtoExp.getPosicionE(), dtoExp.getEmpresaE(), dtoExp.getDataE(), dtoExp.getDescripcionE(), dtoExp.getImagenE());
		experiencia.setId(dtoExp.getId());
		sExperiencia.save(experiencia);
		
		return new ResponseEntity(new Mensaje("Experiencia creada/actualizada"), HttpStatus.OK);
	}

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
      
        sExperiencia.delete(id);
        return new ResponseEntity(new Mensaje("La experiencia fue eliminada correctamente!"), HttpStatus.OK);
    }
    
    
}
