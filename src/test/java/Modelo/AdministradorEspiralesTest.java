package Modelo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdministradorEspiralesTest {
	
	AdministradorEspirales administradorEspirales;

	@Before
	public void setUp() throws Exception {
		administradorEspirales = new AdministradorEspirales();
	}

	@Test
	public void debeMostrarLoQueContienenLAsEspirales() {
		assertEquals("a1,papas,7,2000\na2,jugo,5,1000\na3,bombombum,5,3000\nb1,chocolatina,0,500\nb2,chicles,3,200\nb3,gomitas,6,1300\nc1,gaseosa,1,2000\nc2,agua,0,2000\nc3,mani,5,1700\n", administradorEspirales.mostrarEspirales());
	}
	
	@Test
	public void pruebaDeConocerLineaDondeEstaElProductoSiCodigoEsa1(){
		assertEquals("a1,papas,7,2000", administradorEspirales.conocerLineaDondeEstaElProducto("a1"));
	}
	
	@Test
	public void pruebaDeConocerLineaDondeEstaElProductoSiCodigoEsa2(){
		assertEquals("a2,jugo,5,1000", administradorEspirales.conocerLineaDondeEstaElProducto("a2"));
	}
	
	@Test
	public void pruebaDeConocerLineaDondeEstaElProductoSiCodigoEsa3(){
		assertEquals("a3,bombombum,5,3000", administradorEspirales.conocerLineaDondeEstaElProducto("a3"));
	}
	
	@Test
	public void pruebaDeConocerLineaDondeEstaElProductoSiCodigoEsb1(){
		assertEquals("b1,chocolatina,0,500", administradorEspirales.conocerLineaDondeEstaElProducto("b1"));
	}
	
	@Test
	public void pruebaDeConocerLineaDondeEstaElProductoSiCodigoEsb2(){
		assertEquals("b2,chicles,3,200", administradorEspirales.conocerLineaDondeEstaElProducto("b2"));
	}
	@Test
	public void pruebaDeConocerLineaDondeEstaElProductoSiCodigoEsb3(){
		assertEquals("b3,gomitas,6,1300", administradorEspirales.conocerLineaDondeEstaElProducto("b3"));
	}
	
	@Test
	public void pruebaDeConocerLineaDondeEstaElProductoSiCodigoEsc1(){
		assertEquals("c1,gaseosa,1,2000", administradorEspirales.conocerLineaDondeEstaElProducto("c1"));
	}
	
	@Test
	public void pruebaDeConocerLineaDondeEstaElProductoSiCodigoEsc2(){
		assertEquals("c2,agua,0,2000", administradorEspirales.conocerLineaDondeEstaElProducto("c2"));
	}
	@Test
	public void pruebaDeConocerLineaDondeEstaElProductoSiCodigoEsc3(){
		assertEquals("c3,mani,5,1700", administradorEspirales.conocerLineaDondeEstaElProducto("c3"));
	}
	
	@Test
	public void DeberiaDarxSiSaldoIngresadoEs1000(){
		assertEquals(1000, administradorEspirales.calcularCambio(1000));
	}
	

}
