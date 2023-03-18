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

import com.spring.argprog.dto.dtoHabilidades;
import com.spring.argprog.model.Habilidades;
import com.spring.argprog.security.controller.Mensaje;
import com.spring.argprog.service.SHabilidades;

@RequestMapping("/habilidades")
@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://portf-kacrisa.web.app/"})

public class CHabilidades {
	
	@Autowired
	SHabilidades sHabilidades;

	@GetMapping("/listar")
	public ResponseEntity<List<Habilidades>> list(){
		List<Habilidades> list = sHabilidades.list();
		return new ResponseEntity(list, HttpStatus.OK);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<?> create(@RequestBody dtoHabilidades dtoHab){
			
		Habilidades Habilidades = new Habilidades(dtoHab.getNombreH(), dtoHab.getPorcentajeH(), dtoHab.getColorH());
		Habilidades.setId(dtoHab.getId());
		sHabilidades.save(Habilidades);
		
		return new ResponseEntity(new Mensaje("Habilidad creada/actualizada"), HttpStatus.OK);
	}

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
      
        sHabilidades.delete(id);
        return new ResponseEntity(new Mensaje("Habilidad eliminada correctamente!"), HttpStatus.OK);
    }
    
}
