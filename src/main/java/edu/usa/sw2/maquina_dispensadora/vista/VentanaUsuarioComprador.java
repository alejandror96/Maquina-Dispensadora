package edu.usa.sw2.maquina_dispensadora.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import edu.usa.sw2.maquina_dispensadora.controlador.controladorDinero;
import edu.usa.sw2.maquina_dispensadora.modelo.Espiral;

public class VentanaUsuarioComprador extends JFrame implements ActionListener {

    JLabel informacionProducto;
    JLabel tituloDineroIngresado;
    JLabel dineroIngresado;
    JLabel espirales;
    JLabel dineroFaltante;
    JLabel cambio;
    JLabel tituloCodigo;
    JLabel tituloDinero;  
    JTextField ingresarCodigo;
    JTextField ingresarDinero;   
    JButton botonEnviarCodigo;
    JButton botonEnviarDinero;
    JButton botonConfirmarCompra;
    JButton botonCancelarCompra;
    int contadorDinero = 0;

    public VentanaUsuarioComprador() {
    	
        super();
        inicializarComponentesDinero();
        inicializarComponentesCodigo();
        mostrarInformacionProducto();
        mostrarCambio();
        mostrarDineroFaltante();
        mostrarDineroIngresado();
        mostrarEspirales();   
        enviarCodigo();
        enviarDinero();
        enviarConfimacionCompra();              
        cancelarCompra(); 
        
        configurarVentana();
    }    
    
    public void cancelarCompra() {
    	
    	botonCancelarCompra = new JButton();    
        botonCancelarCompra.setText("Cancelar compra");   
        botonCancelarCompra.setBounds(370, 200, 140, 30);  
        botonCancelarCompra.addActionListener(new ActionListener(){       	
            public void actionPerformed (ActionEvent e){      
            	reiniciarComponentes(e);
            	}
            });  
        this.add(botonCancelarCompra);		
	}
    
    public void reiniciarComponentes(ActionEvent e){
    	
    	informacionProducto.setText("");
    	dineroIngresado.setText("");
    	dineroFaltante.setText("");
    	cambio.setText("");
    	ingresarCodigo.setText("");
    	ingresarDinero.setText("");
    	contadorDinero = 0;
    }

    public void enviarConfimacionCompra() {

    	botonConfirmarCompra = new JButton();
    	botonConfirmarCompra.setText("Confirmar compra");   
        botonConfirmarCompra.setBounds(220, 200, 140, 30);  
        botonConfirmarCompra.addActionListener(new ActionListener(){       	
            public void actionPerformed (ActionEvent e){      
            	obtenerInformacionConfirmar(e);
            	}
            });       
        this.add(botonConfirmarCompra);
	}

    public void obtenerInformacionConfirmar(ActionEvent e){
    	
    	try {
    		Espiral espiral = new Espiral();
    		controladorDinero dinero = new controladorDinero();
			espiral.setCodigo(ingresarCodigo.getText());
			dinero.setDineroIngresado(Integer.parseInt(ingresarDinero.getText()));
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Datos ingresados incorrecramente", "Error", JOptionPane.ERROR_MESSAGE);
		}
    }
    
    public void enviarDinero() {
        
        botonEnviarDinero = new JButton();
    	dineroIngresado = new JLabel();
    	botonEnviarDinero.setText("Enviar dinero");   
        botonEnviarDinero.setBounds(375, 80, 130, 30);  
        dineroIngresado.setBounds(220, 110, 300, 25);
        botonEnviarDinero.addActionListener(new ActionListener(){       	
            public void actionPerformed (ActionEvent e){  
            	try {
                	contadorDinero = contadorDinero+Integer.parseInt(ingresarDinero.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Datos ingresados incorrecramente", "Error", JOptionPane.ERROR_MESSAGE);
				}
            	dineroIngresado.setText("Dinero ingresado: "+contadorDinero);
                ingresarDinero.setText("");
            	}
            });       
        this.add(botonEnviarDinero);
        this.add(dineroIngresado);
	}

	public void enviarCodigo() {

        botonEnviarCodigo = new JButton();
        botonEnviarCodigo.setText("Enviar código");   
        botonEnviarCodigo.setBounds(375, 50, 130, 30);  
        botonEnviarCodigo.addActionListener(new ActionListener(){       	
            public void actionPerformed (ActionEvent e){      
            	obtenerCodigo(e);
            	}
            });         
        this.add(botonEnviarCodigo);   
	}
    
    public String obtenerCodigo(ActionEvent e){
    	String codigo = ingresarCodigo.getText();
    	System.out.println("Codigo: "+codigo);
    	return codigo;
    }
    
    public void inicializarComponentesCodigo() {

    	tituloCodigo = new JLabel();
        ingresarCodigo = new JTextField();       
        tituloCodigo.setText("Código: ");    
        tituloCodigo.setBounds(220, 50, 80, 25);
        ingresarCodigo.setBounds(275, 50, 100, 25);       
        this.add(tituloCodigo);
        this.add(ingresarCodigo);
	}

    public void inicializarComponentesDinero() {

		ingresarDinero = new JTextField();        
        tituloDinero = new JLabel();
        tituloDinero.setText("Dinero: ");    
        tituloDinero.setBounds(220, 80, 80, 25);
        ingresarDinero.setBounds(275, 80, 100, 25);      
        this.add(tituloDinero);
        this.add(ingresarDinero);
	}

    public void configurarVentana() {
    	
        this.setTitle("Máquina Dispensadora - Comprador");                 
        this.setSize(530, 270);                                 
        this.setLocationRelativeTo(null);                       
        this.setLayout(null);                                   
        this.setResizable(false);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
    public void mostrarEspirales(){
    	
    	espirales = new JLabel();
    	espirales.setText(""); 
    	espirales.setBounds(20, 20, 300, 25);  
    	this.add(espirales);
    }
    
    public void mostrarInformacionProducto(){
    	
    	informacionProducto = new JLabel();
    	informacionProducto.setText(": "); 
    	informacionProducto.setBounds(220, 20, 300, 25);  
    	this.add(informacionProducto);
    }
    
    public void mostrarCambio(){
    	
    	cambio = new JLabel();
    	cambio.setText("Cambio: ");
    	cambio.setBounds(220, 170, 100, 25);
        this.add(cambio);
    }
    
    public void mostrarDineroFaltante(){

    	dineroFaltante = new JLabel();
    	dineroFaltante.setText("Dinero faltante: ");
    	dineroFaltante.setBounds(220, 140, 300, 25);
        this.add(dineroFaltante);
    }
    
    public void mostrarDineroIngresado(){
    	
    	controladorDinero dinero = new controladorDinero();
    	
    }

    public void actionPerformed(ActionEvent e) {
    	
        String nombre = ingresarCodigo.getText();                                 
        JOptionPane.showMessageDialog(this, "Hola " + nombre + ".");    
    }

    public static void main(String[] args) {
    	
        VentanaUsuarioComprador v = new VentanaUsuarioComprador();      
        v.setVisible(true);    
    }
}