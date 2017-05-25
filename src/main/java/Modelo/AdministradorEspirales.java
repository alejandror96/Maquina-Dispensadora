package Modelo;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AdministradorEspirales {
	
	int capacidadMaxima = 15;
	Espiral datosEspiral;
	
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
	
	public void separarLinea(){
		mostrarEspirales();
		String[] informacionEspirales = new String[4];
		informacionEspirales = mostrarEspirales().split(",");
		/*datosEspiral.setCodigo(informacionEspirales[0]);
		datosEspiral.setProducto(informacionEspirales[1]);
		datosEspiral.setCantidad(Integer.parseInt(informacionEspirales[2]));
		datosEspiral.setPrecioProducto(Integer.parseInt(informacionEspirales[3]));*/
		
		System.out.println(mostrarEspirales());
		
		/*for (int i = 0; i < informacionEspirales.length; i++) {
			System.out.println("lkasjd: "+informacionEspirales[i]);
		}*/
	}
}