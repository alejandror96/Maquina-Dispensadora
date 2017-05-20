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
        configurarVentana();
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
		botonCambiarCantidadProducto = new JButton("Enviar cantidad");
		botonEnviarDenominacionArca = new JButton("Enviar nuevo producto");
		
		tituloIdEspiral.setBounds(20, 150, 70, 25);
		tituloNuevoProducto.setBounds(140, 130, 110, 25);
		tituloCantidadProducto.setBounds(140, 160, 70, 25);
		ingresarIdEspiral.setBounds(85, 130, 50, 60);
		ingresarNuevoProducto.setBounds(250, 130, 100, 25);
		ingresarCantidadProducto.setBounds(250, 160, 100, 25);
		botonCambiarCantidadProducto.setBounds(350, 160, 170, 25);
		botonEnviarDenominacionArca.setBounds(350, 130, 170, 25);
		
		this.add(tituloIdEspiral);
		this.add(tituloNuevoProducto);
		this.add(tituloCantidadProducto);
		this.add(ingresarIdEspiral);
		this.add(ingresarNuevoProducto);
		this.add(ingresarCantidadProducto);
		this.add(botonCambiarCantidadProducto);
		this.add(botonEnviarDenominacionArca);
	}

	private void inicializarComponentesArca(int saldoArca, int denominacion) {
		
		tituloIdArca = new JLabel("Id arca: ");
		tituloSaldoArca = new JLabel("Saldo: ");
		tituloDenominacionArca = new JLabel("Denominacion: ");
		ingresarIdArca = new JTextField();
		ingresarSaldoArca = new JTextField("5000");
		ingresarDenominacionArca = new JTextField();
		botonEnviarDenominacionArca = new JButton("Enviar denominacion");
		botonEnviarSaldoArca = new JButton("Enviar saldo");
		
		tituloIdArca.setBounds(20, 70, 60, 25);
		tituloSaldoArca.setBounds(125, 55, 50, 25);
		tituloDenominacionArca.setBounds(125, 85, 100, 25);
		ingresarIdArca.setBounds(70, 55, 50, 60);
		ingresarSaldoArca.setBounds(225, 55, 70, 25);
		ingresarDenominacionArca.setBounds(225, 90, 70, 25);
		botonEnviarDenominacionArca.setBounds(295, 85, 170, 25);
		botonEnviarDenominacionArca.addActionListener(this); 
		botonEnviarSaldoArca.setBounds(295, 55, 170, 25);
		botonEnviarSaldoArca.addActionListener(this); 
		
		this.add(tituloIdArca);
		this.add(tituloSaldoArca);
		this.add(tituloDenominacionArca);
		this.add(ingresarIdArca);
		this.add(ingresarSaldoArca);
		this.add(ingresarDenominacionArca);
		this.add(botonEnviarDenominacionArca);
		this.add(botonEnviarSaldoArca);
	}

	private void inicializarComponentesEstado(String estadoMaquina) {
		
		tituloEstado = new JLabel("Estado: ");
		estado = new JLabel(estadoMaquina);
		botonCambiarEstado = new JButton("Cambiar estado");
		
		tituloEstado.setBounds(20, 20, 50, 25);
		estado.setBounds(70, 20, 160, 25);
		botonCambiarEstado.setBounds(180, 20, 160, 25);
		botonCambiarEstado.addActionListener(this); 
		
		this.add(tituloEstado);
		this.add(estado);
		this.add(botonCambiarEstado);
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