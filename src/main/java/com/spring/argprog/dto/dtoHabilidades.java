package com.spring.argprog.dto;

public class dtoHabilidades {
	
	private int id;
	private String nombreH;
	private String porcentajeH;
	private String colorH;
	
	
	public dtoHabilidades() {
		
	}


	public dtoHabilidades(String nombreH, String porcentajeH, String colorH) {
		
		this.nombreH = nombreH;
		this.porcentajeH = porcentajeH;
		this.colorH = colorH;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombreH() {
		return nombreH;
	}


	public void setNombreH(String nombreH) {
		this.nombreH = nombreH;
	}


	public String getPorcentajeH() {
		return porcentajeH;
	}


	public void setPorcentajeH(String porcentajeH) {
		this.porcentajeH = porcentajeH;
	}


	public String getColorH() {
		return colorH;
	}


	public void setColorH(String colorH) {
		this.colorH = colorH;
	}
	
	
	

}
