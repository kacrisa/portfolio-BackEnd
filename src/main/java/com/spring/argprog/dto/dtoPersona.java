package com.spring.argprog.dto;

public class dtoPersona {
	
	private Long id;
	private String nombre;
	private String apellido;
	private String ciudad;
	private String posicion;
	private String bio;
	private String image;
	private String backImage;
	
	public dtoPersona() {
		
	}

	public dtoPersona(String nombre, String apellido, String ciudad, String posicion, String bio, String image,
			String backImage) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.posicion = posicion;
		this.bio = bio;
		this.image = image;
		this.backImage = backImage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getBackImage() {
		return backImage;
	}

	public void setBackImage(String backImage) {
		this.backImage = backImage;
	}
	
	
	

}
