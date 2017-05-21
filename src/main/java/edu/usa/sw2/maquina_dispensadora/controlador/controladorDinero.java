package edu.usa.sw2.maquina_dispensadora.controlador;

import edu.usa.sw2.maquina_dispensadora.vista.VentanaUsuarioComprador;

public class controladorDinero {
	
	int dineroIngresado;
	
	public int getDineroIngresado() {
		return dineroIngresado;
	}

	public void setDineroIngresado(int dineroIngresado) {
		this.dineroIngresado = dineroIngresado;
	}

	VentanaUsuarioComprador ventanaComprador;

	public VentanaUsuarioComprador getVentanaComprador() {
		return ventanaComprador;
	}

	public void setVentanaComprador(VentanaUsuarioComprador ventanaComprador) {
		this.ventanaComprador = ventanaComprador;
	}
}