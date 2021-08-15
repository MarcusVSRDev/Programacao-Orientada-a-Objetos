package Questao2;

import java.util.Scanner;

public class OperacaoMatematicaMain {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		System.out.println("1) Soma");
		System.out.println("2) Subtração");
		System.out.println("3) Multiplicação");
		System.out.println("4) Divisão");
		System.out.println("Digite a opção desejada: ");
		int Opcao = Teclado.nextInt();
		
		if(Opcao == 1) {
			System.out.println("Digite um numero: ");
			int Numero1 = Teclado.nextInt();
			System.out.println("Digite outro numero: ");
			int Numero2 = Teclado.nextInt();
			Soma Numero = new Soma();
			System.out.println("O resultado da soma é: "  + Numero.Calcula(Numero1, Numero2));
		}
		if(Opcao == 2) {
			System.out.println("Digite um numero: ");
			int Numero1 = Teclado.nextInt();
			System.out.println("Digite outro numero: ");
			int Numero2 = Teclado.nextInt();
			Subtracao Numero = new Subtracao();
			System.out.println("O resultado da subtração é: " + Numero.Calcula(Numero1, Numero2));
		}
		if(Opcao == 3) {
			System.out.println("Digite um numero: ");
			int Numero1 = Teclado.nextInt();
			System.out.println("Digite outro numero: ");
			int Numero2 = Teclado.nextInt();
			Multiplicacao Numero = new Multiplicacao();
			System.out.println("O resultado da multiplicação é: " + Numero.Calcula(Numero1, Numero2));
		}
		if(Opcao == 4) {
			System.out.println("Digite um numero: ");
			int Numero1 = Teclado.nextInt();
			System.out.println("Digite outro numero: ");
			int Numero2 = Teclado.nextInt();
			Divisao Numero = new Divisao();
			System.out.println("O resultado da divisão é: " + Numero.Calcula(Numero1, Numero2));
		}
			
	}

}
