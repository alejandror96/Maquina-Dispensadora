package Controlador;

import java.awt.HeadlessException;
import java.io.IOException;

import Modelo.AdministradorEspirales;

public class ControladorEspirales{

	AdministradorEspirales administradorDeEspirales = new AdministradorEspirales();
	
	public void validarSaldoProductoDisponible(String codigo){
		administradorDeEspirales.conocerLineaDondeEstaElProducto(codigo);
	}
	
	public String mostrarEspirales(){
		return administradorDeEspirales.mostrarEspirales();
	}
	
	public void verificarEspiralSeleccionada() throws IOException{
		 administradorDeEspirales.verificarContenidoEnEspiral();
	}
	
	public void mostrarPrecioYNombreDeProducto(){
		administradorDeEspirales.mostrarPrecioYNombreDeProducto();
	}

	public void confirmarCompra(int saldoIngresado) throws HeadlessException, IOException {
		administradorDeEspirales.confirmarCompra(saldoIngresado);
	}

	public void calcularCambio(int saldoIngresado) {
		administradorDeEspirales.calcularCambio(saldoIngresado);
		
	}

	public void cancelarCompra(int auxiliarConteoDinero) {
		administradorDeEspirales.cancelarCompra(auxiliarConteoDinero);
		
	}

	public void cambiarCantidadDelProducto(String codigoProducto, int cantidadProducto) {
		administradorDeEspirales.cambiarCantidadProducto(codigoProducto,cantidadProducto);
	}
}