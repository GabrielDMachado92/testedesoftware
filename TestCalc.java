package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import main.Operacoes;

public class TestCalc {

	
	
	@org.junit.Test
	public void testSoma() {
		double num1 = 1;
		double num2 = 2;
		assertEquals(3, Operacoes.Soma(num1, num2),0);
				
	}
	
	@org.junit.Test
	public void testSubtracao() {
		double num1 = 1;
		double num2 = 2;
		assertEquals(-1, Operacoes.Subtracao(num1, num2),0);
		
	}

	@org.junit.Test
	public void testMultiplicacao() {
		double num1 = 1;
		double num2 = 2;
		assertEquals(2, Operacoes.Multiplicacao(num1, num2),0);
		
	}

	@org.junit.Test
	public void testDivisao() {
		double num1 = 4;
		double num2 = 2;
		assertEquals(2, Operacoes.Divisao(num1, num2),0);
		
	}

	@org.junit.Test
	public void testPotenciacao() {
		double num1 = 2;
		double num2 = 3;
		assertEquals(8, Operacoes.Potenciacao(num1, num2),0);
		
	}

	@org.junit.Test
	public void testRaizQuadrada() {
		double num1 = 16;
		assertEquals(4, Operacoes.RaizQuadrada(num1),0);
		
	}

	@org.junit.Test
	public void testBhaskara() {
		double a = 16;
		double b = 16;
		double c = 16;
		
		List<Double> res = Operacoes.Bhaskara(a, b, c);
		if(res.isEmpty()) {
			assertTrue(true);
		} else if(res.size() == 1) {
		}
		
	}
	

}
