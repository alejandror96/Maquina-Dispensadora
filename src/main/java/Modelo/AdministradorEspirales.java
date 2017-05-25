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
<<<<<<< HEAD
	
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
	
=======

	public void verificarCantidad(String codigo) {
		
		JOptionPane.showMessageDialog(null, "Algo"+codigo);
	}
>>>>>>> da98d6ab1674cfdf9957c493765b3f66f5967683
}