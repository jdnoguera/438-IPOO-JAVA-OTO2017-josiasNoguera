package com.josiasnoguera.ipoo.repuestos.storage;

import java.util.ArrayList;
import java.util.List;

import com.josiasnoguera.ipoo.repuestos.datos.cliente.Cliente;

public class DummyStorage implements Storage{
	//lista de clientes de gua'u
	private List<Cliente> clientes;
	
	public DummyStorage(){
		
		//inicializo mi vector
		clientes =new ArrayList<>();
		
		//variable para simular un autonumerico de base de datos
		int id=0;
		//creacion del primer cliente
		Cliente c=new Cliente();
		
		c.setNombre("Josias Noguera");
		c.setNroDoc("2222");
		c.setTipoDoc("CI");
		c.setPassword("123miro");
		//aumenta el contador, antes tenia 0 ahora contiene el valor 1
		c.setId(++id);
		//agrego el cliente al vector
		clientes.add(c);
		
		//segundo cliente
		Cliente c2=new Cliente();
		c2.setTipoDoc("CI");
		c2.setNroDoc("1111");
		c2.setPassword("12345");
		c2.setNombre("Otro Cliente");
		//aumenta el contador, de 1 a 2
		c2.setId(++id);
		//agrega el segundo cliente
		clientes.add(c2);
		
		//segundo cliente
		Cliente c3=new Cliente();
		c3.setTipoDoc("CI");
		c3.setNroDoc("111");
		c3.setPassword("1234");
		c3.setNombre("Otro Cliente mas");
				//aumenta el contador, de 2 a 3
		c3.setId(++id);
				//agrega el tercer cliente
		clientes.add(c3);
		
	}
	

	@Override
	public Cliente obtCliente(String tipoDoc, String nroDoc, String password) {
		//recorre el vector asignando cada miembro a la variable "c"
		for(Cliente c: clientes){
			//compara los tres valores con los recibidos por parametro, si coinciden retorna el cliente
			//el metodo equals compara dos String, el operador "&&" significa "and", o en español "y"
			if (
					c.getTipoDoc().equals(tipoDoc) &&
					c.getNroDoc().equals(nroDoc)&&
					c.getPassword().equals(password)
				){
				//entonces retorna cliente
				return c;
				
			}
		}
		//si no encontro, retorna null
		return null;
	}	
	
	//prueba de la clase
		public static void main(String[]args){
			
			//creo una instancia de la clase DummyStorage
			Storage s=new DummyStorage();
			//contengo el primer cliente
			Cliente c=s.obtCliente("CI","2222","123miro");
			//imprimo en consola si es null (no encontro el cliente)
			System.out.println("Es null c:" + (c==null));
			//imprimo el nombre del cliente si no es null
			if(c!=null) System.out.println("Nombre del Cliente:"+ c.getNombre());
			else System.out.println("No se enconetro el cliente");
		
			//otro cliente
			
			//obtengo el segundo cliente
			Cliente c2=s.obtCliente("CI","1111","12345");
			//imprimo en consola si es null (no encontro el cliente)
			System.out.println("Es null c:" + (c2==null));
			//imprimo el nombre del cliente si no es null
			if(c2!=null) System.out.println("Nombre del Cliente:"+ c2.getNombre());
			else System.out.println("No se enconetro el cliente");
			
			//ahora un cliente que no existe 
			
			//obtengo el un cliente que no existe, sera null (ahora si existe)
			Cliente c3=s.obtCliente("CI","111","1234");
			//imprimo en consola si es null (no encontro el cliente)
			System.out.println("Es null c:" + (c3==null));
			//imprimo el nombre del cliente si no es null
			if(c3!=null) System.out.println("Nombre del Cliente:"+ c3.getNombre());
			else System.out.println("No se enconetro el cliente");
			
			
			
			
			
			
			
		}
}
