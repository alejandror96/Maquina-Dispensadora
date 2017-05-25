package Controlador;

import java.io.IOException;

import Modelo.AdministradorArcas;

public class ControladorArcas {
	
	AdministradorArcas administradorDeArcas = new AdministradorArcas();
	
	public String obtenerArca(int saldo) throws IOException {
		return administradorDeArcas.obtenerArca(saldo);
		
	}
}
