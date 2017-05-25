package Vista;

import javax.swing.JOptionPane;

public class VentanaUsuarioAdministrador {
	 
	public String menuUsuarioAdministrador(){
		String accionAdministrador= JOptionPane.showInputDialog("Digite 1 si quiere cambiar la cantidad de algun producto y 2 para salir");
		return accionAdministrador ;
	}
	public int recibirCantidad(){
		int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad nueva del producto"));
	return cantidad;
	
	}
}
