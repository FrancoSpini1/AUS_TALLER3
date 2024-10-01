package ar.com.fs.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	@Test
	void sumarTest() {
		// AAA (Arrange-> prepara escenario algo pa que falle
		/*, Act->ejecutar la prueba para ver si funciona bien, 
		 * Assert -> corrobora que lo de act dio bien, sino
		 * informa el error);
		 * */
		//arrange
		Calculadora calculadora = new Calculadora();
		calculadora.setNro1(1);
		calculadora.setNro2(5);
		//act
		calculadora.sumar();
		//Assert
		assertEquals(6.0,calculadora.sumar());
		/*
		 * aca no hace falta gastarse mucho con el test
		 *porque el + es un operadorr de Java (ta re testeado) 
		 * */
	}
	@Test
	void multiplicarTest()
	{
		//Arrange:
		Calculadora calculadora = new Calculadora();
		calculadora.setNro1(3);
		calculadora.setNro2(5);
		//Act:
		calculadora.multiplicar();
		//assert
		assertEquals(15.0,calculadora.multiplicar());
	}
	@Test
	void restarTest()
	{
		//Arrange:
		Calculadora calculadora = new Calculadora();
		calculadora.setNro1(3);
		calculadora.setNro2(5);
		//Act:
		calculadora.restar();
		//assert
		assertEquals(-2,calculadora.restar());
	}
	@Test
	void dividirTest()
	{
		//Arrange:
		Calculadora calculadora = new Calculadora();
		calculadora.setNro1(3);
		calculadora.setNro2(0);
		//Act:
		System.out.println("antes dividir");
		calculadora.dividir();
		System.out.println("despues dividir");
		//assert
		assertEquals(4.0,calculadora.dividir());
	}
}
