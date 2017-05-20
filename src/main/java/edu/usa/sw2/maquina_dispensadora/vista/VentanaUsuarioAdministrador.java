package edu.usa.sw2.maquina_dispensadora.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaUsuarioAdministrador extends JFrame implements ActionListener {

    JLabel tituloEstado;
    JLabel tituloIdArca;
    JLabel tituloSaldoArca;
    JLabel tituloDenominacionArca;
    JLabel tituloNuevoProducto;
    JLabel tituloIdEspiral;
    JLabel tituloCantidadProducto;
    JLabel estado;
    JTextField ingresarIdArca;
    JTextField ingresarIdEspiral;
    JTextField ingresarSaldoArca;
    JTextField ingresarDenominacionArca;
    JTextField ingresarNuevoProducto;
    JTextField ingresarCantidadProducto;    
    JButton botonCambiarEstado;
    JButton botonEnviarSaldoArca;
    JButton botonEnviarDenominacionArca;
    JButton botonCambiarProducto;
    JButton botonCambiarCantidadProducto;

    public VentanaUsuarioAdministrador() {
    	
        super();    
        inicializarComponentesEstado("Fuera de servicio");
        inicializarComponentesArca(0 , 0);
        inicializarComponentesEspiral();   
        enviarSaldoArca();
        enviarDenominacionArca();
        enviarNuevoProductoEspiral();
        enviarCantidadProducto();
        cambiarEstado("Disponible");
        configurarVentana();
    }

	private void cambiarEstado(final String nuevoEstado) {

		botonCambiarEstado = new JButton("Cambiar estado");
		botonCambiarEstado.setBounds(180, 20, 160, 25);
		botonCambiarEstado.addActionListener(new ActionListener(){       	
            public void actionPerformed (ActionEvent e){      
            	estado.setText(nuevoEstado);
            	}
            });  
		this.add(botonCambiarEstado);
	}

	private void enviarCantidadProducto() {
		
		botonCambiarCantidadProducto = new JButton("Enviar cantidad");
		botonCambiarCantidadProducto.setBounds(350, 160, 170, 25);
		botonCambiarCantidadProducto.addActionListener(new ActionListener(){       	
            public void actionPerformed (ActionEvent e){      
            	enviarInformacionCantidadProducto(e);
            	}
            }); 
		this.add(botonCambiarCantidadProducto);
	}
	
	private String enviarInformacionCantidadProducto (ActionEvent e){
		
		String informacionCantidadProducto = ingresarIdEspiral.getText()+","+ingresarCantidadProducto.getText();
		System.out.println("Cantidad producto: "+informacionCantidadProducto);
		return informacionCantidadProducto;
	}

	private void enviarNuevoProductoEspiral() {

		botonCambiarProducto = new JButton("Enviar nuevo producto");
		botonCambiarProducto.setBounds(350, 130, 170, 25);
		botonCambiarProducto.addActionListener(new ActionListener(){       	
            public void actionPerformed (ActionEvent e){      
            	enviarInformacionCambiarProducto(e);
            	}
            }); 
		this.add(botonCambiarProducto);
	}
	
	private String enviarInformacionCambiarProducto(ActionEvent e){
		
		String informacionCambiarProducto = ingresarIdEspiral.getText()+","+ingresarNuevoProducto.getText();
		System.out.println("Nuevo producto: "+informacionCambiarProducto);
		return informacionCambiarProducto;
	}

	private void enviarDenominacionArca() {

		botonEnviarDenominacionArca = new JButton("Enviar denominacion");
		botonEnviarDenominacionArca.setBounds(295, 85, 170, 25);
		botonEnviarDenominacionArca.addActionListener(new ActionListener(){       	
            public void actionPerformed (ActionEvent e){      
            	enviarInformacionCambiarDenominacionArca(e);
            	}
            });  
		this.add(botonEnviarDenominacionArca);
	}
	
	private String enviarInformacionCambiarDenominacionArca(ActionEvent e){
		
		String informacionCambiarDenominacionArca = ingresarIdArca.getText()+","+ingresarDenominacionArca.getText();
		System.out.println("Cambiar denominacion: "+informacionCambiarDenominacionArca);
		return informacionCambiarDenominacionArca;
	}

	private void enviarSaldoArca() {
		
		botonEnviarSaldoArca = new JButton("Enviar saldo");		
		botonEnviarSaldoArca.setBounds(295, 55, 170, 25);
		botonEnviarSaldoArca.addActionListener(new ActionListener(){       	
            public void actionPerformed (ActionEvent e){      
            	enviarInformacionCambiarSaldoArca(e);
            	}
            });   
		this.add(botonEnviarSaldoArca);
	}
	
	private String enviarInformacionCambiarSaldoArca(ActionEvent e){
		
		String informacionCambiarSaldoArca = ingresarIdArca.getText()+","+ingresarSaldoArca.getText();
		System.out.println("Cambiar saldo: "+informacionCambiarSaldoArca);
		return informacionCambiarSaldoArca;
	}

	private void configurarVentana() {
    	
        this.setTitle("Máquina Dispensadora - Administrador");                 
        this.setSize(530, 270);                                 
        this.setLocationRelativeTo(null);                       
        this.setLayout(null);                                   
        this.setResizable(false);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }

	private void inicializarComponentesEspiral() {
		
		tituloIdEspiral = new JLabel("Id espiral: ");
		tituloNuevoProducto = new JLabel("Nuevo producto: ");
		tituloCantidadProducto = new JLabel("Cantidad: ");
		ingresarIdEspiral = new JTextField();
		ingresarNuevoProducto = new JTextField();
		ingresarCantidadProducto = new JTextField();		
		tituloIdEspiral.setBounds(20, 150, 70, 25);
		tituloNuevoProducto.setBounds(140, 130, 110, 25);
		tituloCantidadProducto.setBounds(140, 160, 70, 25);
		ingresarIdEspiral.setBounds(85, 130, 50, 60);
		ingresarNuevoProducto.setBounds(250, 130, 100, 25);
		ingresarCantidadProducto.setBounds(250, 160, 100, 25);		
		this.add(tituloIdEspiral);
		this.add(tituloNuevoProducto);
		this.add(tituloCantidadProducto);
		this.add(ingresarIdEspiral);
		this.add(ingresarNuevoProducto);
		this.add(ingresarCantidadProducto);
	}

	private void inicializarComponentesArca(int saldoArca, int denominacion) {
		
		tituloIdArca = new JLabel("Id arca: ");
		tituloSaldoArca = new JLabel("Saldo: ");
		tituloDenominacionArca = new JLabel("Denominacion: ");
		ingresarIdArca = new JTextField();
		ingresarSaldoArca = new JTextField("5000");
		ingresarDenominacionArca = new JTextField();		
		tituloIdArca.setBounds(20, 70, 60, 25);
		tituloSaldoArca.setBounds(125, 55, 50, 25);
		tituloDenominacionArca.setBounds(125, 85, 100, 25);
		ingresarIdArca.setBounds(70, 55, 50, 60);
		ingresarSaldoArca.setBounds(225, 55, 70, 25);
		ingresarDenominacionArca.setBounds(225, 90, 70, 25);		
		this.add(tituloIdArca);
		this.add(tituloSaldoArca);
		this.add(tituloDenominacionArca);
		this.add(ingresarIdArca);
		this.add(ingresarSaldoArca);
		this.add(ingresarDenominacionArca);
	}

	private void inicializarComponentesEstado(String estadoMaquina) {
		
		tituloEstado = new JLabel("Estado: ");
		estado = new JLabel(estadoMaquina);		
		tituloEstado.setBounds(20, 20, 50, 25);
		estado.setBounds(70, 20, 160, 25);		
		this.add(tituloEstado);
		this.add(estado);
	}
	
    public void actionPerformed(ActionEvent e) {
        String nombre = ingresarDenominacionArca.getText();                                 
        JOptionPane.showMessageDialog(this, "Hola " + nombre + ".");    
    }

    public static void main(String[] args) {
        VentanaUsuarioAdministrador vA = new VentanaUsuarioAdministrador();      
        vA.setVisible(true);             
    }
}