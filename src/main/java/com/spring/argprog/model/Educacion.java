package com.spring.argprog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Educacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String escuelaE;
	private String tituloE;
	private String dataE;
	private String descripcionE;
	private String imagenE;
	
	public Educacion() {
		
	}

	public Educacion(String escuelaE, String tituloE, String dataE, String descripcionE, String imagenE) {

		this.escuelaE = escuelaE;
		this.tituloE = tituloE;
		this.dataE = dataE;
		this.descripcionE = descripcionE;
		this.imagenE = imagenE;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEscuelaE() {
		return escuelaE;
	}

	public void setEscuelaE(String escuelaE) {
		this.escuelaE = escuelaE;
	}

	public String getTituloE() {
		return tituloE;
	}

	public void setTituloE(String tituloE) {
		this.tituloE = tituloE;
	}

	public String getDataE() {
		return dataE;
	}

	public void setDataE(String dataE) {
		this.dataE = dataE;
	}

	public String getDescripcionE() {
		return descripcionE;
	}

	public void setDescripcionE(String descripcionE) {
		this.descripcionE = descripcionE;
	}

	public String getImagenE() {
		return imagenE;
	}

	public void setImagenE(String imagenE) {
		this.imagenE = imagenE;
	}
	
	

}


