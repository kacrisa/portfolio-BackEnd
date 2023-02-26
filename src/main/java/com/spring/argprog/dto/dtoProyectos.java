package com.spring.argprog.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class dtoProyectos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombreP;
	private String fechaP;
	private String descripcionP;
	private String imagenP;
	
	public dtoProyectos() {
		
	}

	public dtoProyectos(String nombreP, String fechaP, String descripcionP, String imagenP) {

		this.nombreP = nombreP;
		this.fechaP = fechaP;
		this.descripcionP = descripcionP;
		this.imagenP = imagenP;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public String getFechaP() {
		return fechaP;
	}

	public void setFechaP(String fechaP) {
		this.fechaP = fechaP;
	}

	public String getDescripcionP() {
		return descripcionP;
	}

	public void setDescripcionP(String descripcionP) {
		this.descripcionP = descripcionP;
	}

	public String getImagenP() {
		return imagenP;
	}

	public void setImagenP(String imagenP) {
		this.imagenP = imagenP;
	}

}
