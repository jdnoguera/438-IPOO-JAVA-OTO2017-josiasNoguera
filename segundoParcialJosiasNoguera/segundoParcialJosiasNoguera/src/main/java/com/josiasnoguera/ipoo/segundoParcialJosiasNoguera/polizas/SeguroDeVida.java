package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.polizas;

import com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.asegurados.Asegurado;
import com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.datos.persona.BeneficiarioSeguro;

public class SeguroDeVida extends Poliza {
	private Poliza poliza;
	private BeneficiarioSeguro beneficiarioseguro;
	private Asegurado asegurado;
	public SeguroDeVida(){
		
	}
	public SeguroDeVida(Poliza poliza, BeneficiarioSeguro beneficiarioseguro, Asegurado asegurado) {
		super();
		this.poliza = poliza;
		this.beneficiarioseguro = beneficiarioseguro;
		this.asegurado = asegurado;
	}
	public Poliza getPoliza() {
		return poliza;
	}
	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}
	public BeneficiarioSeguro getBeneficiarioseguro() {
		return beneficiarioseguro;
	}
	public void setBeneficiarioseguro(BeneficiarioSeguro beneficiarioseguro) {
		this.beneficiarioseguro = beneficiarioseguro;
	}
	public Asegurado getAsegurado() {
		return asegurado;
	}
	public void setAsegurado(Asegurado asegurado) {
		this.asegurado = asegurado;
	}
	
}
