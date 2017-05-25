package Controlador;

import javax.swing.JOptionPane;

public class SistemaDispensador {

	ControladorVentanaUsuarioComprador controladorVentanaComprador = new ControladorVentanaUsuarioComprador();
	ControladorEspirales controladorDeEspirales = new ControladorEspirales();
	
	Boolean estado = true;
	int saldo;
	
	public SistemaDispensador(){
		super();
		verificarEspiralExistente();
		hacerConteoDelDineroIngresado();
		confirmarCompra();
	}
	
	private boolean verificarEspiralExistente() {
		Boolean auxiliarVerificacionEspiral = false;	
		while(auxiliarVerificacionEspiral == false){		
			if (controladorDeEspirales.mostrarEspirales().contains(recibirCodigoIngresado()+",")){
				auxiliarVerificacionEspiral = true;
			}else{
				JOptionPane.showMessageDialog(null, "El código ingresado no existe", "Error", JOptionPane.ERROR_MESSAGE);
				auxiliarVerificacionEspiral = false;
			}
		}
		return auxiliarVerificacionEspiral;
	}

	private void confirmarCompra() {
		JOptionPane.showMessageDialog(null, "Aqui se confirma la compra");
	}

	private int hacerConteoDelDineroIngresado() {
		int auxiliarConteoDinero = 0;
		String auxiliarMenu = "1";
		while(auxiliarMenu.equals("1")){
			auxiliarConteoDinero = auxiliarConteoDinero + recibirDineroIngresado();
			JOptionPane.showMessageDialog(null, "Dinero ingresado hasta el momento: " + auxiliarConteoDinero);
			auxiliarMenu = JOptionPane.showInputDialog("1. Ingresar dinero \nOtro. Continuar");	
		}
		return auxiliarConteoDinero;
	}

	public int recibirDineroIngresado() {
		controladorVentanaComprador = new ControladorVentanaUsuarioComprador();
		return controladorVentanaComprador.mostrarDineroIngresado();
	}

	private String recibirCodigoIngresado() {
		return controladorVentanaComprador.mostrarCodigoIngresado();
		
	}

	public static void main(String[] args) {
		SistemaDispensador sd = new SistemaDispensador();
	}
}