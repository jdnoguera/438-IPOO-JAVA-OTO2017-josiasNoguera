package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.datos.persona;

public class TipoRelacion {
	private int id;
	private String nombre;
	
	public TipoRelacion(){
		
	}

	public TipoRelacion(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



}
