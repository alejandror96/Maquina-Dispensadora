package Modelo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;


public class AdministradorArcasTest {

	AdministradorArcas administradorArcas;
	
	@Before
	public void SetUp(){
		administradorArcas = new AdministradorArcas();
	}
	
	@Test
	public void algo() throws IOException {
		assertEquals("",administradorArcas.obtenerArca(0));
	}

}
