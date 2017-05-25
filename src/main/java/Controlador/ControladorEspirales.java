package Controlador;

import Modelo.AdministradorEspirales;

public class ControladorEspirales{

	AdministradorEspirales administradorDeEspirales = new AdministradorEspirales();
	
	public void informacionProducto(){
		administradorDeEspirales.mostrarInformacionProducto();
	}
	
	public String enviarCodigoIngresado(){
		return informarCodigoIngresado();
	}
	
	public String mostrarEspirales(){
		return administradorDeEspirales.mostrarEspirales();
	}
}