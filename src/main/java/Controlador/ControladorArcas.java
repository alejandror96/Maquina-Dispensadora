package Controlador;

import java.io.IOException;

import Modelo.AdministradorArcas;

public class ControladorArcas {
	
	AdministradorArcas administradorDeArcas = new AdministradorArcas();
	
	public void crearArcas(){
		
	}

	public void obtenerArca(int saldo) throws IOException {
		administradorDeArcas.obtenerArca(saldo);
		
	}
}
