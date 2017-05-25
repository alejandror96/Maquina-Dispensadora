package Vista;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class VentanaUsuarioAdministradorTest {

	VentanaUsuarioAdministrador ventanaUsuarioAdministrador;
	
	@Before
	public void SetUp(){
		ventanaUsuarioAdministrador = new VentanaUsuarioAdministrador();
	}

	@Test
	public void debeDar2SiMenu2() {
		assertEquals("2", ventanaUsuarioAdministrador.menuUsuarioAdministrador());
	}
	
	@Test
	public void debeDar1SiMenu1() {
		assertEquals("1", ventanaUsuarioAdministrador.menuUsuarioAdministrador());
	}
	
	@Test
	public void debeDar1SiAccion1() {
		assertEquals("1", ventanaUsuarioAdministrador.menuUsuarioAdministrador());
	}
	
	@Test
	public void debeDar2SiAccion2() {
		assertEquals("1", ventanaUsuarioAdministrador.menuUsuarioAdministrador());
	}
	
	@Test
	public void debedar2000SiEntrada2000() {
		assertEquals(2000, ventanaUsuarioAdministrador.recibirCantidad());
	}
	
	@Test
	public void debedar50SiEntrada50() {
		assertEquals(50, ventanaUsuarioAdministrador.recibirCantidad());
	}
	
	@Test
	public void debedar5000SiEntrada5000() {
		assertEquals(5000, ventanaUsuarioAdministrador.recibirCantidad());
	}
	
	@Test
	public void debedar10000SiEntrada10000() {
		assertEquals(10000, ventanaUsuarioAdministrador.recibirCantidad());
	}
	
	@Test
	public void debedar200SiEntrada200() {
		assertEquals(200, ventanaUsuarioAdministrador.recibirCantidad());
	}
	
	@Test
	public void debedar0SiEntrada0() {
		assertEquals(0, ventanaUsuarioAdministrador.recibirCantidad());
	}
}