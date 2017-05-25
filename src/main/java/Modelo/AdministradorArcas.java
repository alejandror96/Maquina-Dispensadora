package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Controlador.ControladorArcas;

public class AdministradorArcas {
	
	Arca arca = new Arca();
	ArrayList <Arca> arcasPorDenominacion= new ArrayList <Arca> ();
	int dineroMaquina;
	
	public String obtenerArca(int saldo) throws IOException{
		File fichero = new File("arcas.txt");
		Scanner s = null;
		String auxiliar ="";
		JOptionPane.showMessageDialog(null, "monto"+saldo);
		try {
			s = new Scanner(fichero);
			while (s.hasNextLine()) {
				String linea = s.nextLine();
				String[] datosArca = linea.split(",");
				if(linea.contains(","+saldo+",")){
					auxiliar = linea;
				}
				arca.setIdArca(Integer.parseInt(datosArca[0]));
				arca.setDenominacion(Integer.parseInt(datosArca[1]));
				arca.setCantidadMaxima(Integer.parseInt(datosArca[3]));
				arca.setCantidadAlmacenada(Integer.parseInt(datosArca[2]));
				arcasPorDenominacion.add(arca);
				dineroMaquina = dineroMaquina + (arca.getDenominacion()*arca.getCantidadAlmacenada());
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
		asignarPiezaEnArca(auxiliar);
		return auxiliar;
	}
	
	public void asignarPiezaEnArca(String linea) throws IOException{
		String[] datosArca= linea.split(",");
		arca.setIdArca(Integer.parseInt(datosArca[0]));
		arca.setDenominacion(Integer.parseInt(datosArca[1]));
		arca.setCantidadAlmacenada(Integer.parseInt(datosArca[2])+1);
		arca.setCantidadMaxima(Integer.parseInt(datosArca[3]));
		String nuevaLinea=arca.getIdArca()+","+arca.getDenominacion()+","+arca.getCantidadAlmacenada()+","+arca.getCantidadMaxima();
		try{
			File inFile = new File("arcas.txt");
	        if (!inFile.isFile()) {
	            System.out.println("archivo que no existe");
	            return;
	        }
			File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
	        BufferedReader br = new BufferedReader(new FileReader("arcas.txt"));
	        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
	        String recorredorArchivo;
	        pw.println(nuevaLinea);
			while ((recorredorArchivo = br.readLine()) != null) {
				if (!recorredorArchivo.trim().equals(linea)) {
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
