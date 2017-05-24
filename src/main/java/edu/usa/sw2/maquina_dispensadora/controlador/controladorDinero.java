package edu.usa.sw2.maquina_dispensadora.controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import edu.usa.sw2.maquina_dispensadora.vista.VentanaUsuarioComprador;

public class controladorDinero {
	
	int dineroIngresado;
	static String codigo="f1";
	
	public static void main(String[] args) throws FileNotFoundException{

		leerArchivo(codigo);
		validarDineroIngresado();
	}
	
	private static String leerArchivo(String codigo) {
		File fichero = new File("productos.txt");
		Scanner s = null;
		String aux = null;
		try {
			s = new Scanner(fichero);

			while (s.hasNextLine()) {
				String linea = s.nextLine();
				if (linea.contains(codigo)) {
					System.out.println(linea);
					aux = linea;
				}
			}
		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} 
		
		return aux;
	}

	public static void validarDineroIngresado() throws FileNotFoundException{
		
		if(leerArchivo(codigo) == null){
			JOptionPane.showMessageDialog(null, "EL codigo ingresado no pertenece a ninguna espiral");
		}
	}
	
	public int getDineroIngresado() {
		return dineroIngresado;
	}

	public void setDineroIngresado(int dineroIngresado) {
		this.dineroIngresado = dineroIngresado;
	}

	VentanaUsuarioComprador ventanaComprador;

	public VentanaUsuarioComprador getVentanaComprador() {
		return ventanaComprador;
	}

	public void setVentanaComprador(VentanaUsuarioComprador ventanaComprador) {
		this.ventanaComprador = ventanaComprador;
	}
}