package Vista;
import javax.swing.JOptionPane;

public class VentanaUsuarioComprador {

	String codigoIngresado = "";
	int dineroIngresado = 0;
	
	public String recibirCodigo() {
		String filaCodigo = JOptionPane.showInputDialog("Ingrese la fila");
		int columnaCodigo = -1;
		try {
			columnaCodigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna"));
			if (0 > columnaCodigo || columnaCodigo > 99){
				JOptionPane.showMessageDialog(null, "El numero debe estar entre 0 y 99");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un valor numérico", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return codigoIngresado = filaCodigo+""+columnaCodigo;
	}
	
	public String mostrarDenominaciones(){
		String denominacionIngresada = JOptionPane.showInputDialog("Ingrese un numero segun la denominación a ingresar"
				+ "\n1. $50"
				+ "\n2. $100"
				+ "\n3. $200"
				+ "\n4. $500"
				+ "\n5. $1000"
				+ "\n6. $2000"
				+ "\n7. $5000"
				+ "\n8. $10000"
				+ "\n9. $20000");
		return denominacionIngresada;
	}
	
	public int recibirDinero(){	
		int dineroIngresado = 0;
		String denominacionDinero = mostrarDenominaciones();
		if(denominacionDinero.equals("1")){
			dineroIngresado = 50;
		}else if(denominacionDinero.equals("2")){
			dineroIngresado = 100;
		}else if(denominacionDinero.equals("3")){
			dineroIngresado = 200;
		}else if(denominacionDinero.equals("4")){
			dineroIngresado = 500;
		}else if(denominacionDinero.equals("5")){
			dineroIngresado = 1000;
		}else if(denominacionDinero.equals("6")){
			dineroIngresado = 2000;
		}else if(denominacionDinero.equals("7")){
			dineroIngresado = 5000;
		}else if(denominacionDinero.equals("8")){
			dineroIngresado = 10000;
		}else if(denominacionDinero.equals("9")){
			dineroIngresado = 20000;
		}
		return dineroIngresado;	
	}
}