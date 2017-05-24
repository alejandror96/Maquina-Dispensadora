package edu.usa.sw2.maquina_dispensadora.controlador;

import java.util.ArrayList;

public class SistemaDispensador {

	Boolean estado;
	int saldo;
	
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String recibirCodigo(){
		
		return null;
	}
	public ArrayList<String> mostrarInformacion(){
		return null;
	}
	public int recibirDineroCliente(){ //alejandra
		
		return saldo;
		
	}
	public Boolean validarSiExisteSaldo(){ //alejandra
		return estado;
		
	}
	public void cancelarUnaCompra(){ //alejandra
		
	}
	
}
