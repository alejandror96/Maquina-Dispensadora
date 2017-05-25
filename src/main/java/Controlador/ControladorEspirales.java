package Controlador;

import Modelo.AdministradorEspirales;

public class ControladorEspirales{

	AdministradorEspirales administradorDeEspirales = new AdministradorEspirales();
	
	public void validarSaldoProductoDisponible(String codigo){
		administradorDeEspirales.verificarCantidad(codigo);
	}
	
	public String mostrarEspirales(){
		return administradorDeEspirales.mostrarEspirales();
	}
	
	public boolean verificarEspiralSeleccionada(){
		return administradorDeEspirales.verificarContenidoEnEspiral();
	}
}