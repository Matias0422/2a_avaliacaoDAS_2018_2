package teste;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import app.Calculadora;

@RunWith(Parameterized.class)
public class TesteCalculoRendimentoBruto {
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList( new Object[][] {
			{60,1000,8.5f,13.972603f},{120,500,8.0f,13.150684f},{240,3000,9.0f,177.53424f}
		});
	}
	
	@Parameter(0)
	public int n;
	@Parameter(1)
	public float p;
	@Parameter(2)
	public float i;
	@Parameter(3)
	public float r;
	
	
	@Test
	public void test() {

		assertEquals(r, Calculadora.calculoRendimentoBruto(n,p,i),0f);
	}

}
