package app;

public class Calculadora {
	
	public static float calculoRendimentoBruto(int n, float p, float i) {
		float valorAno = n/365.0f;
		valorAno = (valorAno/100) * 100;
		float resultado = p*i*valorAno;
		return (resultado/100.00f);
	}
	
	public static float calculoImposto(float bruto, float ir) {
		float resultado = bruto*(ir/100);
		return resultado;
	}
	
	public static float calculoRendimentoLiquido(float rendimentoBruto, float p, float imposto) {
		float resultado = ((((rendimentoBruto+p-imposto)/p)*100)-100);
		return resultado;
	}
}
