package com.josiasnoguera.ipoo.repuestos.storage;

import com.josiasnoguera.ipoo.repuestos.datos.cliente.Cliente;

//declaracion de interface
public interface Storage {

	Cliente obtCliente(String tipoDoc, String nroDoc, String password);
	
}
