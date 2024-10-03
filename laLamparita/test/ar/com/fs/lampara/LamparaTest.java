package ar.com.fs.lampara;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LamparaTest {	
	
	@Test
	void crearLampara() {
		//arrange
		Lampara l1;
		//act
		l1 = new Lampara();
		//assert
		assertEquals(true,l1.consultarEstado());
	}
	
	@Test
	void encendido() {
		//arrange
		Lampara l1;
		l1 = new Lampara();
		//act
		l1.on();
		//assert
		assertEquals(false,l1.consultarEstado());
	}
	
	@Test
	void apagado() {
		//arrange
		Lampara l1;
		l1 = new Lampara(); //-->la lampara esta apagada (encendido == false -> !encendido == true)
		//act
		l1.on(); // --> prendo lampara (encendido == true -> !encendido == false)
		l1.off();// --> apago lampara (encendido == false -> !encendido == true)
		//assert
		assertEquals(true,l1.consultarEstado());
	}	
	

}
