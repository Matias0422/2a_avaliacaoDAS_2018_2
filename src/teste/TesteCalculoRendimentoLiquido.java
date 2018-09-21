package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Calculadora;

public class TesteCalculoRendimentoLiquido {

	@Test
	public void test() {
		int n = 60;
		float p = 1000f;
		float i = 8.5f;
		
		float rendimentoBruto = Calculadora.calculoRendimentoBruto(n,p,i);
		assertEquals(1.0829f, Calculadora.calculoRendimentoLiquido(rendimentoBruto, p),0f);
	}
	
	@Test
	public void test2() {
		int n = 120;
		float p = 500f;
		float i = 8.0f;
		
		float rendimentoBruto = Calculadora.calculoRendimentoBruto(n,p,i);
		assertEquals(2.0384f, Calculadora.calculoRendimentoLiquido(rendimentoBruto, p),0f);
	}

}
