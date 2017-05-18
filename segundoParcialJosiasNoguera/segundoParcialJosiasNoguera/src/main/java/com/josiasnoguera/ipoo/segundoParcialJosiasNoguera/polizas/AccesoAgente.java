package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.polizas;

import java.util.Date;

public class AccesoAgente {
	private long id;
	private Date fechaHoraInicio;
	private Date fechaHoraFin;
	private Agente agente;
	
	public AccesoAgente(){
		
	}

	public AccesoAgente(long id, Date fechaHoraInicio, Date fechaHoraFin, Agente agente) {
		super();
		this.id = id;
		this.fechaHoraInicio = fechaHoraInicio;
		this.fechaHoraFin = fechaHoraFin;
		this.agente = agente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFechaHoraInicio() {
		return fechaHoraInicio;
	}

	public void setFechaHoraInicio(Date fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}

	public Date getFechaHoraFin() {
		return fechaHoraFin;
	}

	public void setFechaHoraFin(Date fechaHoraFin) {
		this.fechaHoraFin = fechaHoraFin;
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}
	
}
