package com.josiasnoguera.ipoo.segundoParcialJosiasNoguera.datos.persona;

public class BeneficiarioSeguro {
	private long id;
	private int portentaje;
	private Beneficiario beneficiario;
	private TipoRelacion tiporelacion;
	
	public BeneficiarioSeguro(){
		
	}

	public BeneficiarioSeguro(long id, int portentaje, Beneficiario beneficiario, TipoRelacion tiporelacion) {
		super();
		this.id = id;
		this.portentaje = portentaje;
		this.beneficiario = beneficiario;
		this.tiporelacion = tiporelacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPortentaje() {
		return portentaje;
	}

	public void setPortentaje(int portentaje) {
		this.portentaje = portentaje;
	}

	public Beneficiario getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}

	public TipoRelacion getTiporelacion() {
		return tiporelacion;
	}

	public void setTiporelacion(TipoRelacion tiporelacion) {
		this.tiporelacion = tiporelacion;
	}
	
	
}
