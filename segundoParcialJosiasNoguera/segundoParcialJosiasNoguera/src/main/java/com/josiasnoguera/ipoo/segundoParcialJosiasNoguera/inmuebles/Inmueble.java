package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.inmuebles;

public class Inmueble {
	private long id;
	private String cuentaCatastral;
	private String direccion;
	private String caracteristicas;
	private double valorTerreno;
	private double valorEdificio;
	private Propietario propietario;
	
	public Inmueble(){
		
	}

	public Inmueble(long id, String cuentaCatastral, String direccion, String caracteristicas, double valorTerreno,
			double valorEdificio, Propietario propietario) {
		super();
		this.id = id;
		this.cuentaCatastral = cuentaCatastral;
		this.direccion = direccion;
		this.caracteristicas = caracteristicas;
		this.valorTerreno = valorTerreno;
		this.valorEdificio = valorEdificio;
		this.propietario = propietario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCuentaCatastral() {
		return cuentaCatastral;
	}

	public void setCuentaCatastral(String cuentaCatastral) {
		this.cuentaCatastral = cuentaCatastral;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public double getValorTerreno() {
		return valorTerreno;
	}

	public void setValorTerreno(double valorTerreno) {
		this.valorTerreno = valorTerreno;
	}

	public double getValorEdificio() {
		return valorEdificio;
	}

	public void setValorEdificio(double valorEdificio) {
		this.valorEdificio = valorEdificio;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
	
}
