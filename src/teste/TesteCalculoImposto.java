package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Calculadora;

public class TesteCalculoImposto {

	@Test
	public void test() {

		float p = 1000f;
		float ir = 22.5f;
		
		assertEquals(3.14f, Calculadora.calculoImposto(p,ir),0f);
	}
	
	@Test
	public void test2() {

		float p = 500f;
		float ir = 22.5f;
		
		assertEquals(2.96f, Calculadora.calculoImposto(p,ir),0f);
	}

}
