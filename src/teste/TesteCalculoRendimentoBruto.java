package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Calculadora;

public class TesteCalculoRendimentoBruto {

	@Test
	public void test() {
		int n = 60;
		float p = 1000f;
		float i = 8.5f;
		
		assertEquals(13.97f, Calculadora.calculoRendimentoBruto(n,p,i),0f);
	}
	
	@Test
	public void test2() {
		int n = 120;
		float p = 500f;
		float i = 8.0f;
		
		assertEquals(13.15f, Calculadora.calculoRendimentoBruto(n,p,i),0f);
	}

}
