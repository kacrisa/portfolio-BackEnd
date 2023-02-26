package com.spring.argprog.dto;

public class dtoIdiomas {
	
	private int id;
	private String nombreI;
	private String nivelI;
	private String porcentajeI;
	
	public dtoIdiomas() {
		
	}

	public dtoIdiomas(String nombreI, String nivelI, String porcentajeI) {
		
		this.nombreI = nombreI;
		this.nivelI = nivelI;
		this.porcentajeI = porcentajeI;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreI() {
		return nombreI;
	}

	public void setNombreI(String nombreI) {
		this.nombreI = nombreI;
	}

	public String getNivelI() {
		return nivelI;
	}

	public void setNivelI(String nivelI) {
		this.nivelI = nivelI;
	}

	public String getPorcentajeI() {
		return porcentajeI;
	}

	public void setPorcentajeI(String porcentajeI) {
		this.porcentajeI = porcentajeI;
	}
	
	

}
