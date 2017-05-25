package Controlador;

import Modelo.AdministradorEspirales;

public class ControladorEspirales{

	AdministradorEspirales administradorDeEspirales = new AdministradorEspirales();
	
	public String mostrarEspirales(){
		return administradorDeEspirales.mostrarEspirales();
	}
}