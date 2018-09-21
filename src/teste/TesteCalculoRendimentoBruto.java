package teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculoRendimentoBruto {

	@Test
	public void test() {
		int n = 60;
		float p = 1000f;
		float i = 8.5f;
		
		assertEquals(13.97f, Calculadora.calculoRendimentoBruto(n,p,i),0f);
	}

}
