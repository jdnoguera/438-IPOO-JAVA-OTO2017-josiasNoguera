package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.datos.persona;

public class LugardeTrabajo {
	private String puesto;
	private double ingresos;
	private int antiguedad;
	private Empresas empresas;
	
	public LugardeTrabajo(){
		
	}

	public LugardeTrabajo(String puesto, double ingresos, int antiguedad) {
		super();
		this.puesto = puesto;
		this.ingresos = ingresos;
		this.antiguedad = antiguedad;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Empresas getEmpresas() {
		return empresas;
	}

	public void setEmpresas(Empresas empresas) {
		this.empresas = empresas;
	}
	
	
	
	
}
