package Modelo;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

import Controlador.SistemaDispensador;

public class AdministradorEspirales {
	File fichero = new File("productos.txt");
	Scanner s = null;
	int capacidadMaxima = 15;
	Espiral datosEspiral;
	
	public String mostrarEspirales() {
		
		String auxiliarParaMostrar = "";
		try {
			s = new Scanner(fichero);
			while (s.hasNextLine()) {
				String linea = s.nextLine();
				auxiliarParaMostrar = auxiliarParaMostrar + linea + "\n";
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
		JOptionPane.showMessageDialog(null, auxiliarParaMostrar);
		return auxiliarParaMostrar;
	}
	


	
}