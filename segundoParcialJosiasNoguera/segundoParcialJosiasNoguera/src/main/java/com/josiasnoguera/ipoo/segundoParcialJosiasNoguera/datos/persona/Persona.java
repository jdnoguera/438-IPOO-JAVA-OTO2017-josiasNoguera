package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.datos.persona;

import java.util.Date;

public class Persona {
	private long id;
	private String nombre;
	private String lugarDeNacimiento;
	private Date fechaNacimiento;
	private String nacionalidad;
	private String tipoDoc;
	private String nroDoc;
	private String direccion;
	private String telefono;
	
	public Persona(){
		
	}

	public Persona(long id, String nombre, String lugarDeNacimiento, Date fechaNacimiento, String nacionalidad,
			String tipoDoc, String nroDoc, String direccion, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.lugarDeNacimiento = lugarDeNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugarDeNacimiento() {
		return lugarDeNacimiento;
	}

	public void setLugarDeNacimiento(String lugarDeNacimiento) {
		this.lugarDeNacimiento = lugarDeNacimiento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	


}