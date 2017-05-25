package Modelo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class AdministradorArcasTest {

	AdministradorArcas administradorArcas;
	@Before 
	public void setUp(){
		administradorArcas= new AdministradorArcas();
	}
	
	@Test
	public void deberiaDarCadaArca() throws IOException {
		assertEquals("5,1000,14,50",administradorArcas.obtenerArca(1000));
	}

}
