package Controlador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ControladorVentanaUsuarioCompradorTest {

	ControladorVentanaUsuarioComprador ventanaComprador;
	
	@Before
	public void SetUp(){
		ventanaComprador = new ControladorVentanaUsuarioComprador();
	}
	
	@Test
	public void debeDara1SiIngresaa1() {
		assertEquals("a1", ventanaComprador.mostrarCodigoIngresado());
	}
	
	@Test
	public void debeDarb1SiIngresab1() {
		assertEquals("b1", ventanaComprador.mostrarCodigoIngresado());
	}
	
	@Test
	public void debeDarc1SiIngresac1() {
		assertEquals("c1", ventanaComprador.mostrarCodigoIngresado());
	}
	
	@Test
	public void debeDar1000SiIngresa5() {
		assertEquals(1000, ventanaComprador.mostrarDineroIngresado());
	}
	
	@Test
	public void debeDar50SiIngresa1() {
		assertEquals(50, ventanaComprador.mostrarDineroIngresado());
	}
	
	@Test
	public void debeDar100SiIngresa2() {
		assertEquals(100, ventanaComprador.mostrarDineroIngresado());
	}
	
	@Test
	public void debeDar0SiIngresa10() {
		assertEquals(0, ventanaComprador.mostrarDineroIngresado());
	}
	
	@Test
	public void debeDar0SiIngresa19() {
		assertEquals(0, ventanaComprador.mostrarDineroIngresado());
	}
	
	@Test
	public void debeDar0SiIngresa15() {
		assertEquals(0, ventanaComprador.mostrarDineroIngresado());
	}
	
	@Test
	public void debeDar0SiIngresa500() {
		assertEquals(0, ventanaComprador.mostrarDineroIngresado());
	}
}