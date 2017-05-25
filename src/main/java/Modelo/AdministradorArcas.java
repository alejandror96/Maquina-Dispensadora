package Modelo;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Controlador.ControladorArcas;

public class AdministradorArcas {
	
	ControladorArcas controladorArcas = new ControladorArcas();
	Arca arca = new Arca();
	ArrayList <Arca> arcasPorDenominacion= new ArrayList <Arca> ();
	
	public void crearLasArcas(){
		File fichero = new File("productos.txt");
		Scanner s = null;
		try {
			s = new Scanner(fichero);
			while (s.hasNextLine()) {
				String linea = s.nextLine();
				String[] datosArca = linea.split(",");
				arca.setIdArca(Integer.parseInt(datosArca[0]));
				arca.setDenominacion(Integer.parseInt(datosArca[1]));
				arca.setCantidadMaxima(Integer.parseInt(datosArca[2]));
				arca.setCantidadAlmacenada(Integer.parseInt(datosArca[3]));
				arcasPorDenominacion.add(arca);
			}
		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
	
	public void obtenerArca() {
		for (int i = 0; i < arcasPorDenominacion.size(); i++) {
			//if (arcasPorDenominacion.contains(arca.g))
		}
	}
		
}
