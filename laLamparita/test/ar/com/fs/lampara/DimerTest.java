package ar.com.fs.lampara;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DimerTest {

	@Test
	void creoDimer() {
		//arrange
		Dimer d1 ;
		//act
		d1 = new Dimer();	//creo dimmer (si es una lampara creo una lampara su valor debe ser cero , encendido ==false -> !encedido == true;
		//assert
		assertEquals(true,d1.consultarEstado());
		assertEquals(0, d1.consultarItensidad());
	}
	
	@Test
	void incrementoDimer() {
		//arrange
		Dimer d1 = new Dimer();
		//act
		d1.inc();  //como creé la lampara y la subi una unidad, encendido == 1 && encendido == terue -> !encendido ==falase
		d1.inc();	//como creé la lampara y la subi una unidad, encendido == 2 && encendido == terue -> !encendido ==falase
		//assert
		assertEquals(2, d1.consultarItensidad());
		assertEquals(false,d1.consultarEstado());
	}
	
	@Test
	void decrementoDimer() {
		//arrange
		Dimer d1=new Dimer(); //->encendido ==0, false !encendido == true
		//act
		d1.inc();//encendida ==1 ,true
		d1.dec();//encendido ==0, false
		//assert
		assertEquals(0, d1.consultarItensidad());
		assertEquals(true,d1.consultarEstado());
	}
	
	@Test
	void apagoDimer(){
		//a1
		Dimer d1 = new Dimer();
		//a2
		d1.inc();
		d1.off();
		//a3  -> son 2, uno da 0 y otro true
		assertEquals(true,d1.consultarEstado());
		assertEquals(0,d1.consultarItensidad());
	}
	
	@Test
	
	void prendoDimer() {
		Dimer d1= new Dimer();
		d1.on();
		//2 assert, 1 debe dar false y el otro 1
		System.out.println(d1.consultarEstado());
		System.out.println(d1.consultarItensidad());
		assertEquals(false,d1.consultarEstado());//->false
		assertEquals(1,d1.consultarItensidad());//->1
	}
	
	
	

}
