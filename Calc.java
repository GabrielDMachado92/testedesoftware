package main;

import java.util.Scanner;

public class Calc {

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
				System.out.println("Digite o primeiro numero:");
				double num1 = Double.parseDouble(input.nextLine());
				System.out.println("Digite o segundo numero:");
				double num2 = Double.parseDouble(input.nextLine());
				Operacoes.Soma(num1,num2);
				break;
			case 2:
				System.out.println("Operação escolhida: Subtracao");
				System.out.println("Digite o primeiro numero:");
				double num3 = Double.parseDouble(input.nextLine());
				System.out.println("Digite o segundo numero:");
				double num4 = Double.parseDouble(input.nextLine());
				Operacoes.Subtracao(num3, num4);
				break;
			case 3:
				System.out.println("Operação escolhida: Multiplicacao");
				System.out.println("Digite o primeiro numero:");
				double num5 = Double.parseDouble(input.nextLine());
				System.out.println("Digite o segundo numero:");
				double num6 = Double.parseDouble(input.nextLine());
				Operacoes.Multiplicacao(num5, num6);
				break;
			case 4:
				System.out.println("Operação escolhida: Divisao");
				System.out.println("Digite o primeiro numero:");
				double num7 = Double.parseDouble(input.nextLine());
				System.out.println("Digite o segundo numero:");
				double num8 = Double.parseDouble(input.nextLine());
				Operacoes.Divisao(num7, num8);
				break;
			case 5:
				System.out.println("Operação escolhida: Potenciacao");
				System.out.println("Digite a base:");
				double num9 = Double.parseDouble(input.nextLine());
				System.out.println("Digite a potencia:");
				double num10 = Double.parseDouble(input.nextLine());
				Operacoes.Potenciacao(num9,num10);
				break;
			case 6:
				System.out.println("Operação escolhida: Raiz Quadrada");
				System.out.println("Digite o numero que voce quer a raiz quadrada de:");
				double num11 = Double.parseDouble(input.nextLine());
				Operacoes.RaizQuadrada(num11);
				break;
			case 7:
				System.out.println("Operação escolhida: Bhaskara");
				System.out.println("Funcao ax^2 + bx + c = 0:");
				System.out.println("Digite o a:");
				double a = Double.parseDouble(input.nextLine());

				System.out.println("Digite o b:");
				double b = Double.parseDouble(input.nextLine());

				System.out.println("Digite o c:");
				double c = Double.parseDouble(input.nextLine());
				Operacoes.Bhaskara(a,b,c);
				break;
			default:
				break;
			}

		}
	}

}

