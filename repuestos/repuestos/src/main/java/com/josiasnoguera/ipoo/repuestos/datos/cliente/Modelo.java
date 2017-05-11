package com.josiasnoguera.ipoo.repuestos.datos.cliente;

public class Modelo {
	
	private int id;
	private String nombre;
	private String descripcion;
	
	private Marca marca;

	//constructor1
	//metodos
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	//constructor2
	public Modelo(int id, String nombre, String descripcion, Marca marca) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marca = marca;
		}
		
}	
	