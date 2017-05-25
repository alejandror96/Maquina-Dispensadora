package Controlador;

import javax.swing.JOptionPane;

import Vista.VentanaUsuarioComprador;

public class SistemaDispensador {

	ControladorVentanaUsuarioComprador controladorVentanaComprador = new ControladorVentanaUsuarioComprador();
	ControladorEspirales controladorDeEspirales = new ControladorEspirales();
	
	Boolean estado = true;
	int saldo;
	String codigoIngresado;
	
	public SistemaDispensador(){
		super();
		verificarEspiralExistente();
		enviarCodigoIngresado(codigoIngresado);
		mostrarNombreYPrecioDeProducto();
		hacerConteoDelDineroIngresado();
	}

	private void mostrarNombreYPrecioDeProducto() {
		controladorDeEspirales.mostrarPrecioYNombreDeProducto();
	}

	private void enviarCodigoIngresado(String codigo) {
		controladorDeEspirales.validarSaldoProductoDisponible(codigo);
	}


	public boolean verificarEspiralExistente() {
		Boolean auxiliarVerificacionEspiral = false;	
		while(auxiliarVerificacionEspiral == false){		
			if (controladorDeEspirales.mostrarEspirales().contains(recibirCodigoIngresado()+",")){
				auxiliarVerificacionEspiral = true;
				verificarEspiralSeleccionado();
			}else{
				JOptionPane.showMessageDialog(null, "El código ingresado no existe", "Error", JOptionPane.ERROR_MESSAGE);
				auxiliarVerificacionEspiral = false;
			}
		}
		return auxiliarVerificacionEspiral;
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
		return controladorVentanaComprador.mostrarDineroIngresado();
	}

	public String recibirCodigoIngresado() {
		codigoIngresado = controladorVentanaComprador.mostrarCodigoIngresado();
		return codigoIngresado;
	}
	
	public Boolean verificarEspiralSeleccionado(){
		return controladorDeEspirales.verificarEspiralSeleccionada();
	}

	public static void main(String[] args) {
		SistemaDispensador sd = new SistemaDispensador();
		
	}
}