package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operacoes {

	static Scanner input = new Scanner(System.in);

	public static double Soma(double num1, double num2) {

		boolean validator = false;

		do {
			try {
				validator = false;
				System.out.println(num1 + num2);
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);
		return num1 + num2;

	}

	public static double Subtracao(double num1, double num2) {
		boolean validator = false;

		do {
			try {
				
				validator = false;
				System.out.println(num1 - num2);
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);
		return num1- num2;
	}

	public static double Multiplicacao(double num1, double num2) {
		boolean validator = false;

		do {
			try {
				
				validator = false;
				System.out.println(num1 * num2);
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);
		return num1 * num2;

	}

	public static double Divisao(double num1, double num2) {
		boolean validator = false;

		do {
			try {
				
				validator = false;
				System.out.println(num1 / num2);
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);
		return num1 / num2;

	}

	public static double Potenciacao(double num1, double num2) {
		boolean validator = false;
		double result = 0;
		do {
			try {
				result = Math.pow(num1, num2);
				System.out.println(result);
				validator = false;
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);
		return result;

	}

	public static double RaizQuadrada(double num1) {
		boolean validator = false;
		double result = 0;
		do {
			try {
				
				result = Math.sqrt(num1);
				System.out.println(result);
				validator = false;
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);
		return result;

	}

	public static List<Double> Bhaskara(double a, double b, double c) {
		boolean validator = false;
		List<Double> result = new ArrayList<Double>();
		do {
			try {
				double delta = 0;
				double result1;
				double result2;
				

				// Calculando delta
				delta = (b * b) - (4 * a * c);
				if (delta < 0) {
					System.out.println("Essa equacao nao possui resultados reais");
				} else if (delta > 0) {
					result1 = ((-b) - Math.sqrt(delta)) / (2 * a);
					result2 = ((-b) + Math.sqrt(delta)) / (2 * a);
					result.add(result1);
					result.add(result2);
					

					System.out.println("x1 = " + result1 + " x2 = " + result2);
				} else if (delta == 0) {
					result1 = ((-b) + Math.sqrt(delta)) / (2 * a);
					result.add(result1);

					System.out.println("x = " + result1);
				}

				validator = false;
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);
		return result;

	}

}
