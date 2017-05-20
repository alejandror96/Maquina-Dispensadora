package edu.usa.sw2.maquina_dispensadora.controlador;

import edu.usa.sw2.maquina_dispensadora.vista.VentanaUsuarioComprador;

public class controladorVistaComprador {

	static VentanaUsuarioComprador ventanaComprador = new VentanaUsuarioComprador();

	private static void mostrarValorBotonCoigo() {
		
		
		System.out.println("Esta es"+ventanaComprador.obtenerCodigo(null));
	}
	
	public static void main(){
		
	}
}
