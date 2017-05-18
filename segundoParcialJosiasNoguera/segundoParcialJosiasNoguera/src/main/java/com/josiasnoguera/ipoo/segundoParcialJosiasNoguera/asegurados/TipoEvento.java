package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.asegurados;

public class TipoEvento {
	private int id;
	private String nombre;
	
	public TipoEvento(){
		
	}

	public TipoEvento(int id, String nombre) {
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
