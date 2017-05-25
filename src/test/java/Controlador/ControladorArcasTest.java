package Controlador;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;


public class ControladorArcasTest {
	
	ControladorArcas controladorDeArcas;
	
	@Before
	public void SetUp(){
		controladorDeArcas = new ControladorArcas();
	}
	
	@Test
	public void debeDarErrorSiEntrada0() throws IOException{
		//assertEquals("", controladorDeArcas.obtenerArca(0));
	}

}