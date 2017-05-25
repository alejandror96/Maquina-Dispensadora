package Modelo;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Controlador.ControladorArcas;

public class AdministradorArcas {
	
	ControladorArcas controladorArcas = new ControladorArcas();
	Arca arca = new Arca();
	
	public void crearLasArcas(){
		
			}
	
	public int obtenerArca() {
		if (controladorArcas.recibirDineroIngresado()==arca.getDenominacion()){
			return arca.getIdArca();
		}
		return arca.getIdArca();
		
		}
	

}
