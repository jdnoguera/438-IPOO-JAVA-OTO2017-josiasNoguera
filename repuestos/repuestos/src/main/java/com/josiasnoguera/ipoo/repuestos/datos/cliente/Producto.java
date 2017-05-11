package com.josiasnoguera.ipoo.repuestos.datos.cliente;

public class Producto {
	//atributos
	private int id;
	private String nombre;
	private String descripcion;
	private byte imagen;
	private double precio;
	
	private Modelo modelo;
	
	//constructor 1
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
	public byte getImagen() {
		return imagen;
	}
	public void setImagen(byte imagen) {
		this.imagen = imagen;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
	//constructor 2
	
	public Producto(int id, String nombre, String descripcion, byte imagen, double precio, Modelo modelo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.modelo = modelo;
	}

	



}
