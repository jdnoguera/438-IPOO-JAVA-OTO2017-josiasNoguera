package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.polizas;

import java.util.Date;

import com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.datos.persona.Cliente;

public class Poliza {
	private long id;
	private Date fechaHoraEmision;
	private Date fechaInicio;
	private Date fechaFin;
	private double capitalAsegurado;
	private double importeTotal;
	private double cuota;
	private Date fechaVencimientoCuota;
	private Cliente cliente;
	private Agente agente;
	private AccesoAgente accesoagente;
	
	
	public Poliza(){
		
	}


	public Poliza(long id, Date fechaHoraEmision, Date fechaInicio, Date fechaFin, double capitalAsegurado,
			double importeTotal, double cuota, Date fechaVencimientoCuota, Cliente cliente, Agente agente,
			AccesoAgente accesoagente) {
		super();
		this.id = id;
		this.fechaHoraEmision = fechaHoraEmision;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.capitalAsegurado = capitalAsegurado;
		this.importeTotal = importeTotal;
		this.cuota = cuota;
		this.fechaVencimientoCuota = fechaVencimientoCuota;
		this.cliente = cliente;
		this.agente = agente;
		this.accesoagente = accesoagente;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getFechaHoraEmision() {
		return fechaHoraEmision;
	}


	public void setFechaHoraEmision(Date fechaHoraEmision) {
		this.fechaHoraEmision = fechaHoraEmision;
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public Date getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}


	public double getCapitalAsegurado() {
		return capitalAsegurado;
	}


	public void setCapitalAsegurado(double capitalAsegurado) {
		this.capitalAsegurado = capitalAsegurado;
	}


	public double getImporteTotal() {
		return importeTotal;
	}


	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}


	public double getCuota() {
		return cuota;
	}


	public void setCuota(double cuota) {
		this.cuota = cuota;
	}


	public Date getFechaVencimientoCuota() {
		return fechaVencimientoCuota;
	}


	public void setFechaVencimientoCuota(Date fechaVencimientoCuota) {
		this.fechaVencimientoCuota = fechaVencimientoCuota;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Agente getAgente() {
		return agente;
	}


	public void setAgente(Agente agente) {
		this.agente = agente;
	}


	public AccesoAgente getAccesoagente() {
		return accesoagente;
	}


	public void setAccesoagente(AccesoAgente accesoagente) {
		this.accesoagente = accesoagente;
	}

	
}