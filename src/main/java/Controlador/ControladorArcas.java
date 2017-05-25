package Controlador;

public class ControladorArcas {
	
	SistemaDispensador sistemaDispensador = new SistemaDispensador();
	
	public int recibirDineroIngresado() {
		sistemaDispensador = new SistemaDispensador();
		return sistemaDispensador.recibirDineroIngresado();
	}

}
