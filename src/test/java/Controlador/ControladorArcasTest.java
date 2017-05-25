package Controlador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ControladorArcasTest {
	
	ControladorArcas controladorDeArcas;
	int entradaSaldo;
	
	@Before
	public void SetUp(){
		controladorDeArcas = new ControladorArcas();
	}
	
	@Test
	public void debeDarErrorSiEntrada5(){
		assertEquals("", 5);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}