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
		verificarEspiralSeleccionado();
		mostrarNombreYPrecioDeProducto();
		hacerConteoDelDineroIngresado();
		calcularCambio(saldo);
	}
	public void calcularCambio(int saldoIngresado){
		controladorDeEspirales.calcularCambio(saldoIngresado);
	}

	public void confirmarCompra(int saldoIngresado) {
		controladorDeEspirales.confirmarCompra(saldoIngresado);
	}
	
	public void mostrarNombreYPrecioDeProducto() {
		controladorDeEspirales.mostrarPrecioYNombreDeProducto();
	}

	public void enviarCodigoIngresado(String codigo) {
		controladorDeEspirales.validarSaldoProductoDisponible(codigo);
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

	public int hacerConteoDelDineroIngresado() {
		
		int auxiliarConteoDinero = 0;
		String auxiliarMenu = "1";
		while(auxiliarMenu.equals("1")){
			auxiliarConteoDinero = auxiliarConteoDinero + recibirDineroIngresado();
			JOptionPane.showMessageDialog(null, "Dinero ingresado hasta el momento: " + auxiliarConteoDinero);
			auxiliarMenu = JOptionPane.showInputDialog("1. Ingresar dinero 2.Confirmar compra \nOtro. Cancelar Compra");	
			if(auxiliarMenu!="2"){
				confirmarCompra(auxiliarConteoDinero);
			}else if(auxiliarMenu != "1" || auxiliarMenu != "2"){
				cancelarCompra(auxiliarConteoDinero);
			}
		}
		return auxiliarConteoDinero;
	}

	private void cancelarCompra(int auxiliarConteoDinero) {
		controladorDeEspirales.cancelarCompra(auxiliarConteoDinero);
	}

	public int recibirDineroIngresado() {
		saldo = controladorVentanaComprador.mostrarDineroIngresado();
		return saldo;
	}

	public String recibirCodigoIngresado() {
		codigoIngresado = controladorVentanaComprador.mostrarCodigoIngresado();
		return codigoIngresado;
	}
	
	public void verificarEspiralSeleccionado(){
		 controladorDeEspirales.verificarEspiralSeleccionada();
	}

	public static void main(String[] args) {
		SistemaDispensador sd = new SistemaDispensador();
		
	}
}