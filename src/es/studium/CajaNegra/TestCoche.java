package es.studium.CajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCoche {

	@Test
	void setFabricante1()
	{
		Coche c = new Coche();
		c.setFabricante("Toyota");
		String resultadoReal = c.getFabricante();
		String resultadoEsperado = "Toyota";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void setFabricante2()
	{
		Coche c = new Coche();
		c.setFabricante("Citroen");
		String resultadoReal = c.getFabricante();
		String resultadoEsperado = "Citroen";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void setFabricante3()
	{
		Coche c = new Coche();
	//	c.setFabricante("Hola");
		String resultadoReal = c.getFabricante();
		String resultadoEsperado = "";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void setModelo1()
	{
		Coche c = new Coche();
		c.setModelo("C4");
		String resultadoReal = c.getModelo();
		String resultadoEsperado = "C4";
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	void setModelo2()
	{
		Coche c = new Coche();
		c.setModelo("Rav4");
		String resultadoReal = c.getModelo();
		String resultadoEsperado = "Rav4";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void setModelo3()
	{
		Coche c = new Coche();
	//	c.setModelo("Hola");
		String resultadoReal = c.getModelo();
		String resultadoEsperado = "";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void setAnyo1()
	{
		Coche c = new Coche();
		c.setAnyo(2015);
		int resultadoReal = c.getAnyo();
		int resultadoEsperado = 2015;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void setAnyo2()
	{
		Coche c = new Coche();
	//	c.setAnyo(2014);
		int resultadoReal = c.getAnyo();
		int resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void setAnyo3()
	{
		Coche c = new Coche();
	//	c.setAnyo(2023);
		int resultadoReal = c.getAnyo();
		int resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}
}