package Controlador;

import Vista.VentanaUsuarioComprador;

public class ControladorVentanaUsuarioComprador {
	
	VentanaUsuarioComprador ventanaComprador = new VentanaUsuarioComprador();

	public String mostrarCodigoIngresado() {	
		return ventanaComprador.recibirCodigo();
	}
	
	public int mostrarDineroIngresado() {
		return ventanaComprador.recibirDinero();
	}
	
}