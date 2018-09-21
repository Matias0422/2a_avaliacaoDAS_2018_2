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
		float ir = 22.5f;
		
		
		
		float rendimentoBruto = Calculadora.calculoRendimentoBruto(n,p,i);
		float imposto = Calculadora.calculoImposto(rendimentoBruto,ir);
		assertEquals(1.0828705f, Calculadora.calculoRendimentoLiquido(rendimentoBruto, p, imposto),0f);
	}
	
	@Test
	public void test2() {
		int n = 120;
		float p = 500f;
		float i = 8.0f;
		float ir = 22.5f;
		
		
		float rendimentoBruto = Calculadora.calculoRendimentoBruto(n,p,i);
		float imposto = Calculadora.calculoImposto(rendimentoBruto,ir);
		assertEquals(2.0383606f, Calculadora.calculoRendimentoLiquido(rendimentoBruto, p, imposto),0f);
	}

}
