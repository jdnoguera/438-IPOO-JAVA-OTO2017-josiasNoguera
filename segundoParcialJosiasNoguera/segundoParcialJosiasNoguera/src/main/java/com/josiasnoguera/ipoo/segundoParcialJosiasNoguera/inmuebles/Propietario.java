package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.inmuebles;

import com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.datos.persona.Persona;

public class Propietario extends Persona{
	private Persona persona;
	public Propietario(){
		
	}
	public Propietario(Persona persona) {
		super();
		this.persona = persona;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
}
