package Controlador;

import java.awt.HeadlessException;
import java.io.IOException;

import javax.swing.JOptionPane;


public class SistemaDispensador {
	ControladorVentanaUsuarioAdministrador controladorVentanaAdministrador = new ControladorVentanaUsuarioAdministrador();	
	ControladorVentanaUsuarioComprador controladorVentanaComprador = new ControladorVentanaUsuarioComprador();
	ControladorEspirales controladorDeEspirales = new ControladorEspirales();
	ControladorArcas controladorDeArcas = new ControladorArcas();
	
	Boolean estado = true;
	int saldo;
	String codigoIngresado;
	String accionAdministrador; 
	int cantidadProductoNueva;
	
	public SistemaDispensador() throws IOException{
		super();
		mostrarMenu();
	}
	
	public void mostrarMenu() throws IOException{
		int opcionUsuario= JOptionPane.showConfirmDialog(null, "Quiere usted realizar una compra?");
		if(opcionUsuario==JOptionPane.YES_OPTION){
			metodosUsuarioComprador();
		}else{
			metodosUsuarioAdministrador();
		}
	}
	
	public void metodosUsuarioComprador() throws IOException{
		verificarEspiralExistente();
		enviarCodigoIngresado(codigoIngresado);
		verificarEspiralSeleccionado();
		mostrarNombreYPrecioDeProducto();
		hacerConteoDelDineroIngresado();
		calcularCambio(saldo);
	}
	
	public void metodosUsuarioAdministrador() throws IOException{
		recibirAccionAdministrador();
		accionarTareaAdministrador(accionAdministrador);
		
	}

	public void accionarTareaAdministrador(String accionAdministrador) throws IOException{
		if (accionAdministrador.equals("1")){
			verificarEspiralExistente();
			recibirCantidadProductoNueva();
			enviarCodigoIngresado(codigoIngresado);
			//verificarEspiralSeleccionado();
			cambiarCantidadProducto(codigoIngresado,cantidadProductoNueva);
		}
		System.exit(0);
	}
	
    public void cambiarCantidadProducto(String codigoProducto, int cantidadProducto) throws IOException {
		controladorDeEspirales.cambiarCantidadDelProducto(codigoProducto,cantidadProducto);
	}

	public void calcularCambio(int saldoIngresado){
		controladorDeEspirales.calcularCambio(saldoIngresado);
	}

	public void confirmarCompra(int saldoIngresado) throws HeadlessException, IOException {
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

	public int hacerConteoDelDineroIngresado() throws IOException {
		
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
	
	public int recibirDineroIngresado() throws IOException {
		saldo = controladorVentanaComprador.mostrarDineroIngresado();
		controladorDeArcas.obtenerArca(saldo);
		return saldo;
	}
	
	public String recibirCodigoIngresado() {
		codigoIngresado = controladorVentanaComprador.mostrarCodigoIngresado();
		return codigoIngresado;
	}
	public int recibirCantidadProductoNueva(){
		cantidadProductoNueva = controladorVentanaAdministrador.mostrarCantidad();
		return cantidadProductoNueva;
	}
	public String recibirAccionAdministrador(){
		 accionAdministrador=controladorVentanaAdministrador.recibirAccionAdministrador();
	return accionAdministrador;
	}
	
	
	public void verificarEspiralSeleccionado() throws IOException{
		 controladorDeEspirales.verificarEspiralSeleccionada();
	}

	public static void main(String[] args) throws IOException {
		SistemaDispensador sd = new SistemaDispensador();
		
	}
}