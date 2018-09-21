package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Calculadora;

public class TesteCalculoImposto {

	@Test
	public void test() {
		int n = 60;
		float p = 1000f;
		float ir = 22.5f;
		float i = 8.5f;
		float bruto = Calculadora.calculoRendimentoBruto(n,p,i);
		assertEquals(3.1438355f, Calculadora.calculoImposto(bruto,ir),0f);
	}
	
	@Test
	public void test2() {
		int n = 120;
		float p = 500f;
		float ir = 22.5f;
		float i = 8.0f;
		
		float bruto = Calculadora.calculoRendimentoBruto(n,p,i);
		assertEquals(2.9589038f, Calculadora.calculoImposto(bruto,ir),0f);
	}

}
