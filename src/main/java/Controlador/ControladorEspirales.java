package Controlador;

import Modelo.AdministradorEspirales;

public class ControladorEspirales{

	AdministradorEspirales administradorDeEspirales = new AdministradorEspirales();
	
	public void validarSaldoProductoDisponible(String codigo){
		administradorDeEspirales.conocerLineaDondeEstaElProducto(codigo);
	}
	
	public String mostrarEspirales(){
		return administradorDeEspirales.mostrarEspirales();
	}
	
	public boolean verificarEspiralSeleccionada(){
		return administradorDeEspirales.verificarContenidoEnEspiral();
	}
	
	public void mostrarPrecioYNombreDeProducto(){
		administradorDeEspirales.mostrarPrecioYNombreDeProducto();
	}

	public void rechazarCompra(int saldoIngresado) {
		administradorDeEspirales.rechazarCompra(saldoIngresado);
	}

	public void calcularCambio(int saldoIngresado) {
		administradorDeEspirales.calcularCambio(saldoIngresado);
		
	}
	
}