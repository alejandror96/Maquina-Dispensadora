package Controlador;

import Vista.VentanaUsuarioAdministrador;
public class ControladorVentanaUsuarioAdministrador {

	VentanaUsuarioAdministrador ventanaAdministrador = new VentanaUsuarioAdministrador();

	public String recibirAccionAdministrador(){
		return ventanaAdministrador.menuUsuarioAdministrador();
	}
	public int mostrarCantidad(){
		return ventanaAdministrador.recibirCantidad();
	}
}