package Controlador;

import Vista.VentanaUsuarioComprador;

public class ControladorVentanaUsuarioComprador {
	
	VentanaUsuarioComprador ventanaComprador;

	public String mostrarCodigoIngresado() {	
		ventanaComprador = new VentanaUsuarioComprador();
		return ventanaComprador.recibirCodigo();
	}
	
	public int mostrarDineroIngresado() {
		ventanaComprador = new VentanaUsuarioComprador();
		return ventanaComprador.recibirDinero();
	}
}