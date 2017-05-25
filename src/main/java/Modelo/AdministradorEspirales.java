package Modelo;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

import Controlador.ControladorEspirales;

public class AdministradorEspirales {
	
	int capacidadMaxima = 15;
	Espiral datosEspiral;
	Espiral espiral = new Espiral();
	
	public String mostrarEspirales() {
		File fichero = new File("productos.txt");
		Scanner s = null;
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
	
	public void mostrarInformacionProducto(){
		
		ControladorEspirales controladorEspiral = new ControladorEspirales();
		JOptionPane.showMessageDialog(null, "algo");
	}

	public Boolean verificarContenidoEnEspiral() {
		Boolean auxiliarVerificacionContenidoEspiral = false;	
		while(auxiliarVerificacionContenidoEspiral == false){		
			if (espiral.getCantidad()>1){
				auxiliarVerificacionContenidoEspiral = true;
			}else{
				JOptionPane.showMessageDialog(null, "El producto deseado no posee existencias", "Error", JOptionPane.ERROR_MESSAGE);
				auxiliarVerificacionContenidoEspiral = false;
			}
		}
		return auxiliarVerificacionContenidoEspiral;
		
	}
	
}