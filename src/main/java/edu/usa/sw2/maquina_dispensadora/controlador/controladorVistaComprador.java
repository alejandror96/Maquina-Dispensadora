package edu.usa.sw2.maquina_dispensadora.controlador;

import edu.usa.sw2.maquina_dispensadora.vista.VentanaUsuarioComprador;

public class controladorVistaComprador {

	static VentanaUsuarioComprador ventanaComprador = new VentanaUsuarioComprador();

	private static void mostrarValorBotonCodigo() {
		
		
		System.out.println("Esta es"+ventanaComprador.obtenerCodigo(null));
	}
	private static void mostrarInformacionProducto(){
		System.out.println("informacion producto"+ ventanaComprador.mostrarInformacionProducto());
	}
	
	public static void main(){
		
	}
}
