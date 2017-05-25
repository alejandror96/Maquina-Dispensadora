package Modelo;

import Controlador.ControladorArcas;

public class AdministradorArcas {
	
	ControladorArcas controladorArcas = new ControladorArcas();
	Arca arca = new Arca();
	
	public int obtenerArca() {
		if (controladorArcas.recibirDineroIngresado()==arca.getDenominacion()){
			return arca.getIdArca();
		}
		return arca.getIdArca();
		
		}
	

}
