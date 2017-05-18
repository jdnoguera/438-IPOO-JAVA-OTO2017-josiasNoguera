package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.datos.persona;

public class Cliente extends Persona{
	private Persona persona;
	private LugardeTrabajo lugardetrabajo;

	public Cliente(){
		
	}

	public Cliente(Persona persona, LugardeTrabajo lugardetrabajo) {
		super();
		this.persona = persona;
		this.lugardetrabajo = lugardetrabajo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public LugardeTrabajo getLugardetrabajo() {
		return lugardetrabajo;
	}

	public void setLugardetrabajo(LugardeTrabajo lugardetrabajo) {
		this.lugardetrabajo = lugardetrabajo;
	}
	

}
