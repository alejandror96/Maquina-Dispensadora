package Modelo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

<<<<<<< HEAD
public class AdministradorArcasTest {

	AdministradorArcas administradorArcas;
	@Before 
	public void setUp(){
		administradorArcas= new AdministradorArcas();
	}
	
	@Test
	public void deberiaDarCadaArca() throws IOException {
		assertEquals("5,1000,14,50",administradorArcas.obtenerArca(1000));
=======

public class AdministradorArcasTest {

	AdministradorArcas administradorArcas;
	
	@Before
	public void SetUp(){
		administradorArcas = new AdministradorArcas();
	}
	
	@Test
	public void algo() throws IOException {
		assertEquals("",administradorArcas.obtenerArca(0));
>>>>>>> 24486fe3adfb04d45c59ba99ea170e44f36fa4f7
	}

}
