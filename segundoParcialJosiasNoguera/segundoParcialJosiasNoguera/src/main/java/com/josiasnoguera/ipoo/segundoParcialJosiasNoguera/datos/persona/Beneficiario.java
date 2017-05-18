package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.datos.persona;

public class Beneficiario extends Persona{
	private Persona persona;
	
	public Beneficiario(){
		
	}

	public Beneficiario(Persona persona) {
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
