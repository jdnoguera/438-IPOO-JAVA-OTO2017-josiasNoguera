package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.asegurados;

import java.util.Date;

public class HistorialMedico {
	private long id;
	private Date fecha;
	private TipoEvento tipoevento;
	private LocalDeSalud localdesalud;
	private Medico medico;
	
	public HistorialMedico(){
		
	}

	public HistorialMedico(long id, Date fecha, TipoEvento tipoevento, LocalDeSalud localdesalud, Medico medico) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.tipoevento = tipoevento;
		this.localdesalud = localdesalud;
		this.medico = medico;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public TipoEvento getTipoevento() {
		return tipoevento;
	}

	public void setTipoevento(TipoEvento tipoevento) {
		this.tipoevento = tipoevento;
	}

	public LocalDeSalud getLocaldesalud() {
		return localdesalud;
	}

	public void setLocaldesalud(LocalDeSalud localdesalud) {
		this.localdesalud = localdesalud;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
}
