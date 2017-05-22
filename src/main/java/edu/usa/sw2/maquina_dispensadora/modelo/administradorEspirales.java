package edu.usa.sw2.maquina_dispensadora.modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import edu.usa.sw2.maquina_dispensadora.controlador.SistemaDispensador;

public class administradorEspirales  {

	public Espiral espiral; 
	SistemaDispensador dispensador= new SistemaDispensador();
	
	
	public administradorEspirales() {
	    espiral= new Espiral();
	    
	}
	public  String conseguirEspiral (){
		if(dispensador.recibirCodigo()==espiral.codigo){
		return espiral.codigo;
		}
		return "codigo erroneo de espiral";
	}

	public ArrayList<String> mostrarInformacionProducto(){
		
		return null;
	}
	public void ingresaInformacionAlArchivo() throws IOException { 

		FileWriter fichero = null; 
		PrintWriter pw = null; 
		try 
		{ 
		fichero = new FileWriter("c:/prueba.txt",true); 
		pw = new PrintWriter(fichero); 
		pw.println(espiral.informacion); 

		} catch (Exception e) { 
		e.printStackTrace(); 
		} finally { 
		if (null != fichero) 
		fichero.close(); 
		try { 
		} catch (Exception e2) { 
		e2.printStackTrace(); 
		} 
		} 

		}
}
