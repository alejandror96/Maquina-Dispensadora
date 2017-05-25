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
		mostrarInformacionProducto();
		hacerConteoDelDineroIngresado();
		confirmarCompra();
	}
	
	private void mostrarInformacionProducto() {
		controladorDeEspirales.informacionProducto();
		
	}
	
	public boolean verificarEspiralExistente() {
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

	public void confirmarCompra() {
		controladorDeEspirales.informacionProducto();
	}

	public int hacerConteoDelDineroIngresado() {
		
		int auxiliarConteoDinero = 0;
		String auxiliarMenu = "1";
		while(auxiliarMenu.equals("1")){
			auxiliarConteoDinero = auxiliarConteoDinero + recibirDineroIngresado();
			JOptionPane.showMessageDialog(null, "Dinero ingresado hasta el momento: " + auxiliarConteoDinero);
			auxiliarMenu = JOptionPane.showInputDialog("1. Ingresar dinero \nOtro. Continuar");	
			if(auxiliarMenu!="1"){
			JOptionPane.showMessageDialog(null,"Producto a comprar: "+controladorVentanaComprador); 
			}
		}
		return auxiliarConteoDinero;
	}

	public int recibirDineroIngresado() {
		controladorVentanaComprador = new ControladorVentanaUsuarioComprador();
		return controladorVentanaComprador.mostrarDineroIngresado();
	}

	public String recibirCodigoIngresado() {
		return controladorVentanaComprador.mostrarCodigoIngresado();
		
	}

	public static void main(String[] args) {
		SistemaDispensador sd = new SistemaDispensador();
	}
}