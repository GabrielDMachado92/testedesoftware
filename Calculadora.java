package calculadora;

import java.util.Scanner;

public class Calculadora {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int operacao = 0;

		while (operacao != 99) {

			boolean validator = false;
			String operacaoStr;

			do {
				System.out.println("Bem-vindo a calculadora, por favor escolha a operacao que deseja fazer");
				System.out.println("Digite 1 para Soma");
				System.out.println("Digite 2 para Subtracao");
				System.out.println("Digite 3 para Multiplicacao");
				System.out.println("Digite 4 para Divisao");
				System.out.println("Digite 5 para Potenciacao");
				System.out.println("Digite 6 para Raiz Quadrada");
				System.out.println("Digite 7 para Bhaskara");
				System.out.println("Digite 99 para sair");

				try {
					operacaoStr = input.nextLine();

					operacao = Integer.parseInt(operacaoStr);

					System.out.println("Operacao escolhida = " + operacaoStr);

					validator = false;
				} catch (Exception e) {
					System.out.println("Por favor digite um numero de 1 a 7 ou 99 para sair");
					validator = true;

				}

			} while (validator);

			switch (operacao) {
			case 1:
				System.out.println("Operação escolhida: Soma");
				Soma();
				break;
			case 2:
				System.out.println("Operação escolhida: Subtracao");
				Subtracao();
				break;
			case 3:
				System.out.println("Operação escolhida: Multiplicacao");
				Multiplicacao();
				break;
			case 4:
				System.out.println("Operação escolhida: Divisao");
				Divisao();
				break;
			case 5:
				System.out.println("Operação escolhida: Potenciacao");
				Potenciacao();
				break;
			case 6:
				System.out.println("Operação escolhida: Raiz Quadrada");
				RaizQuadrada();
				break;
			case 7:
				System.out.println("Operação escolhida: Bhaskara");
				Bhaskara();
				break;
			default:
				break;
			}

		}
	}

	static void Soma() {
		boolean validator = false;

		do {
			try {
				System.out.println("Digite o primeiro numero:");
				double num1 = Double.parseDouble(input.nextLine());
				System.out.println("Digite o segundo numero:");
				double num2 = Double.parseDouble(input.nextLine());
				validator = false;
				System.out.println(num1 + num2);
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);

	}

	static void Subtracao() {
		boolean validator = false;

		do {
			try {
				System.out.println("Digite o primeiro numero:");
				double num1 = Double.parseDouble(input.nextLine());
				System.out.println("Digite o segundo numero:");
				double num2 = Double.parseDouble(input.nextLine());
				validator = false;
				System.out.println(num1 - num2);
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);
	}

	static void Multiplicacao() {
		boolean validator = false;

		do {
			try {
				System.out.println("Digite o primeiro numero:");
				double num1 = Double.parseDouble(input.nextLine());
				System.out.println("Digite o segundo numero:");
				double num2 = Double.parseDouble(input.nextLine());
				validator = false;
				System.out.println(num1 * num2);
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);

	}

	static void Divisao() {
		boolean validator = false;

		do {
			try {
				System.out.println("Digite o primeiro numero:");
				double num1 = Double.parseDouble(input.nextLine());
				System.out.println("Digite o segundo numero:");
				double num2 = Double.parseDouble(input.nextLine());
				validator = false;
				System.out.println(num1 / num2);
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);

	}

	static void Potenciacao() {
		boolean validator = false;

		do {
			try {
				System.out.println("Digite a base:");
				double num1 = Double.parseDouble(input.nextLine());
				System.out.println("Digite a potencia:");
				double num2 = Double.parseDouble(input.nextLine());
				double result = Math.pow(num1, num2);
				System.out.println(result);
				validator = false;
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);

	}

	static void RaizQuadrada() {
		boolean validator = false;
		do {
			try {
				System.out.println("Digite o numero que voce quer a raiz quadrada de:");
				double num1 = Double.parseDouble(input.nextLine());
				double result = Math.sqrt(num1);
				System.out.println(result);
				validator = false;
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);

	}

	static void Bhaskara() {
		boolean validator = false;
		do {
			try {
				double delta = 0;
				double result1;
				double result2;
				System.out.println("Funcao ax^2 + bx + c = 0:");
				System.out.println("Digite o a:");
				double a = Double.parseDouble(input.nextLine());

				System.out.println("Digite o b:");
				double b = Double.parseDouble(input.nextLine());

				System.out.println("Digite o c:");
				double c = Double.parseDouble(input.nextLine());

				// Calculando delta
				delta = (b * b) - (4 * a * c);
				if (delta < 0) {
					System.out.println("Essa equacao nao possui resultados reais");
				} else if (delta > 0) {
					result1 = ((-b) - Math.sqrt(delta)) / (2 * a);
					result2 = ((-b) + Math.sqrt(delta)) / (2 * a);

					System.out.println("x1 = " + result1 + " x2 = " + result2);
				} else if (delta == 0) {
					result1 = ((-b) + Math.sqrt(delta)) / (2 * a);

					System.out.println("x = " + result1);
				}

				validator = false;
			} catch (Exception e) {
				System.out.println("Por favor digite um numero valido");
				validator = true;
			}

		} while (validator);

	}
}
