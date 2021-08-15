package Questão_2;

public class Calculadora {

	protected int Numero;
	protected int Numero1; 
	protected int Numero2;
	protected int Soma;
	protected int Subtracao;
	protected int Multiplicacao;
	protected int Divisao;
	
	public Calculadora(int Numero, int Numero1, int Numero2){
		this.Numero = Numero;
		this.Numero1 = Numero1;
		this.Numero2 = Numero2;
	}
	
	public int Soma_2() {
		System.out.println("O resultado da soma do 1º e 2º número é: ");
		int Soma = Numero + Numero1;
		return Soma;
	}
	
	public int Soma_3() {
		System.out.println("O resultado da soma do 1º, 2º e 3º número é: ");
		int Soma = Numero + Numero1 + Numero2;
		return Soma;
	}
	
	public int Subtracao_2() {
		System.out.println("O resultado da subtração do 1º e 2º número é: ");
		int Subtracao = Numero - Numero1;
		return Subtracao;
	}
	
	public int Subtracao_3() {
		System.out.println("O resultado da subtração do 1º, 2º e 3º número é: ");
		int Subtracao = Numero - Numero1 - Numero2;
		return Subtracao;
	}
	
	public int Multiplicacao_2() {
		System.out.println("O resultado da multiplicação do 1º e 2º número é: ");
		int Multiplicacao = Numero * Numero1;
		return Multiplicacao;
	}

	public int Multiplicacao_3() {
		System.out.println("O resultado da multiplicação do 1º, 2º e 3º número é: ");
		int Multiplicacao = Numero * Numero1 * Numero2;
		return Multiplicacao;
	}
	
	public int Divisao_2() {
		System.out.println("O resultado da divisão do 1º e 2º número é: ");
		int Divisao = Numero / Numero1;
		return Divisao;
	}
	
	public int Divisao_3() {
		System.out.println("O resultado da divisão do 1º, 2º e 3º número é: ");
		int Divisao = Numero / Numero1 / Numero2;
		return Divisao;
	}
}
