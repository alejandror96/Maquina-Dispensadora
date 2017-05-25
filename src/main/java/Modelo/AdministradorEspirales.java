package Modelo;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import Controlador.ControladorEspirales;
import Controlador.SistemaDispensador;

public class AdministradorEspirales {
	
	int capacidadMaxima = 15;
	Espiral datosEspiral;
	Espiral espiral = new Espiral();
	String lineaDondeEstaProducto;
	
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
	
	public void conocerLineaDondeEstaElProducto(String codigo) {
		File fichero = new File("productos.txt");
		Scanner s = null;
		String auxiliarLinea = "";
		try {
			s = new Scanner(fichero);
			while (s.hasNextLine()) {
				String linea = s.nextLine();
				if (linea.contains(codigo)){
					auxiliarLinea = linea;	
				}
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
		darValoresAEspiral(auxiliarLinea);
		lineaDondeEstaProducto=auxiliarLinea;
	}
	
	public void darValoresAEspiral(String auxiliarLinea){
		String[] datosEspiral= auxiliarLinea.split(",");
		espiral.setCodigo(datosEspiral[0]);
		espiral.setProducto(datosEspiral[1]);
		espiral.setCantidad(Integer.parseInt(datosEspiral[2]));
		espiral.setPrecioProducto(Integer.parseInt(datosEspiral[3]));
	}
	
	public void mostrarPrecioYNombreDeProducto(){
		JOptionPane.showMessageDialog(null, "Nombre: "+espiral.getProducto()+ " Precio: " + espiral.getPrecioProducto());
	}
	
	public boolean verificarContenidoEnEspiral() throws IOException {
		if (espiral.getCantidad() < 1){
			int opcionCliente;
			opcionCliente=JOptionPane.showConfirmDialog(null, "No hay existencias del producto. ¿Desea hacer otra compra?");
			if (opcionCliente== JOptionPane.YES_OPTION) {
				SistemaDispensador sistemaDispensador =new SistemaDispensador();
			}else
				System.exit(0);
			return false;
		}else{
			return true;
		}
	}
	
	public void confirmarCompra(int saldoIngresado) throws HeadlessException, IOException {
		if((saldoIngresado >= espiral.getPrecioProducto()) && (verificarContenidoEnEspiral() == true) && (1==1)){
			calcularCambio(saldoIngresado);
			JOptionPane.showMessageDialog(null, "Retire su producto de la máquina");
			System.exit(0); 
		}else{
			cancelarCompra(saldoIngresado);
		}		
	}


	public void calcularCambio(int saldoIngresado) {
		int cambio; 
		cambio= saldoIngresado-espiral.getPrecioProducto();
		if(espiral.getPrecioProducto()==saldoIngresado){
			JOptionPane.showMessageDialog(null, "compra exitosa");
		}else 
	JOptionPane.showMessageDialog(null, "Su cambio es de: "+cambio);
	}

	public void cancelarCompra(int auxiliarConteoDinero) {
		JOptionPane.showMessageDialog(null, "Compra rechazada, dinero devuelto: "+auxiliarConteoDinero);
		System.exit(0); 
	}

	public void cambiarCantidadProducto(String codigoProducto, int cantidadProducto) throws IOException {
		String[] datosEspiral= lineaDondeEstaProducto.split(",");
		espiral.setCodigo(datosEspiral[0]);
		espiral.setProducto(datosEspiral[1]);
		espiral.setCantidad(cantidadProducto);
		espiral.setPrecioProducto(Integer.parseInt(datosEspiral[3]));
		String nuevaLinea=espiral.getCodigo()+","+espiral.getProducto()+","+espiral.getCantidad()+","+espiral.getPrecioProducto();
		try{
			File inFile = new File("productos.txt"); 
	        if (!inFile.isFile()) {
	            System.out.println("archivo que no existe");
	            return;
	        }
			File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
	        BufferedReader br = new BufferedReader(new FileReader("productos.txt"));
	        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
	        String recorredorArchivo;
	        pw.println(nuevaLinea);
			while ((recorredorArchivo = br.readLine()) != null) {
				if (!recorredorArchivo.trim().equals(lineaDondeEstaProducto)) {
					pw.println(recorredorArchivo);
	                pw.flush();
	             }
			}
			 pw.close();
	         br.close();
	
	         if (!inFile.delete()) {
	             System.out.println("No se puede");
	             return;
	         }
	         if (!tempFile.renameTo(inFile))
	             System.out.println("No se puede");
		} catch (FileNotFoundException ex) {
         ex.printStackTrace();
     }
		}
}