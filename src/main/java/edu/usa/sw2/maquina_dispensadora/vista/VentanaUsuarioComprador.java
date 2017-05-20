package edu.usa.sw2.maquina_dispensadora.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaUsuarioComprador extends JFrame implements ActionListener {

    JLabel informacionProducto;
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

    public VentanaUsuarioComprador() {
    	
        super();
        inicializarComponentesDinero();
        inicializarComponentesCodigo();
        mostrarInformacionProducto("nombre", "precio");
        mostrarCambio(2000);
        mostrarDineroFaltante(2000);
        mostrarDineroIngresado(2000);
        mostrarEspirales("estas son las espirales");   
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

    public String obtenerInformacionConfirmar(ActionEvent e){
    	
    	String informacionCompra = ingresarCodigo.getText()+","+ingresarDinero.getText();
    	System.out.println("Producto a comprar: "+informacionCompra);
    	return informacionCompra;
    }
    
    public void enviarDinero() {
        
        botonEnviarDinero = new JButton();
    	botonEnviarDinero.setText("Enviar dinero");   
        botonEnviarDinero.setBounds(375, 80, 130, 30);  
        botonEnviarDinero.addActionListener(new ActionListener(){       	
            public void actionPerformed (ActionEvent e){      
            	obtenerDinero(e);
            	}
            });       
        this.add(botonEnviarDinero);
	}
    
    public String obtenerDinero(ActionEvent e){
    	String dinero = ingresarDinero.getText();
    	System.out.println("Dinero: "+dinero);
    	return dinero;
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
    
    public void mostrarEspirales(String informacionEspiral){
    	
    	espirales = new JLabel();
    	espirales.setText(informacionEspiral); 
    	espirales.setBounds(20, 20, 300, 25);  
    	this.add(espirales);
    }
    
    public void mostrarInformacionProducto(String nombre, String precio){
    	
    	informacionProducto = new JLabel();
    	informacionProducto.setText(nombre+": "+precio); 
    	informacionProducto.setBounds(220, 20, 300, 25);  
    	this.add(informacionProducto);
    }
    
    public void mostrarCambio(int cambioAMostrar){
    	
    	cambio = new JLabel();
    	cambio.setText("Cambio: "+cambioAMostrar);
    	cambio.setBounds(220, 170, 100, 25);
        this.add(cambio);
    }
    
    public void mostrarDineroFaltante(int dineroFaltanteAMostrar){

    	dineroFaltante = new JLabel();
    	dineroFaltante.setText("Dinero faltante: "+dineroFaltanteAMostrar);
    	dineroFaltante.setBounds(220, 140, 300, 25);
        this.add(dineroFaltante);
    }
    
    public void mostrarDineroIngresado(int dinero){
    	
    	dineroIngresado = new JLabel();
    	dineroIngresado.setText("Dinero ingresado: "+dinero);    
        dineroIngresado.setBounds(220, 110, 300, 25);
        this.add(dineroIngresado);
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