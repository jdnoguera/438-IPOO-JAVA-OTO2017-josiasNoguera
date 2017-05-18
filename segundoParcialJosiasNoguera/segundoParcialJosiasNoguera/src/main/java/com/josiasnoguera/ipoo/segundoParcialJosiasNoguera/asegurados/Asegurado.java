package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.asegurados;

import java.util.List;

import com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.datos.persona.Persona;

public class Asegurado extends Persona{
	private List<HistorialMedico> historialmedico;
	private Persona persona;
	
	public Asegurado(){
		
	}

	public Asegurado(List<HistorialMedico> historialmedico, Persona persona) {
		super();
		this.historialmedico = historialmedico;
		this.persona = persona;
	}

	public List<HistorialMedico> getHistorialmedico() {
		return historialmedico;
	}

	public void setHistorialmedico(List<HistorialMedico> historialmedico) {
		this.historialmedico = historialmedico;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public void agregarHistoria(HistorialMedico h){
		
	}
}
