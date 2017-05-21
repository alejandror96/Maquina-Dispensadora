package edu.usa.sw2.maquina_dispensadora.modelo;

public class administradorEspirales  {

	public Espiral espiral; 
	
	
	public administradorEspirales() {
	    espiral= new Espiral();
	}
	public  String conseguirEspiral (String codigoIngresado){
		if(codigoIngresado==espiral.codigo){
		return codigoIngresado;
		}
		return "codigo erroneo de espiral";
	}

	
}
