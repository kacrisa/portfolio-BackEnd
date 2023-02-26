package com.spring.argprog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Proyectos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombreP;
	private String fechaP;
	
	@Column(length=2000)
	private String descripcionP;
	
	@Column(length=2000)
	private String imagenP;
	
	public Proyectos() {
		
	}

	public Proyectos(String nombreP, String fechaP, String descripcionP, String imagenP) {

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


