package edu.usa.sw2.maquina_dispensadora.modelo;

import java.util.ArrayList;

public class Espiral {

	boolean estado=false;
	String codigo;
	String nombreProducto;
	int precioProducto;
	int capacidad;
	ArrayList<String> informacion= new ArrayList<String>();
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(int precioProducto) {
		this.precioProducto = precioProducto;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	} 
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public ArrayList<String> enviarInformacionProducto(String nombre, String precio){
		
		informacion.add(precio);
		informacion.add(nombre);
		
		return informacion; 
	}
}
