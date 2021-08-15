package Questão_2;
import java.util.Scanner;

public class CalculadoraMain {
	
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		Calculadora Variavel = new Calculadora(0, 0, 0);
		
		Variavel.Numero = Teclado.nextInt();
		Variavel.Numero1 = Teclado.nextInt();
		Variavel.Numero2 = Teclado.nextInt();
		
		System.out.println(Variavel.Soma_2());
		System.out.println(Variavel.Soma_3());
		
		Variavel.Numero = Teclado.nextInt();
		Variavel.Numero1 = Teclado.nextInt();
		Variavel.Numero2 = Teclado.nextInt();
		
		System.out.println(Variavel.Subtracao_2());
		System.out.println(Variavel.Subtracao_3());
		
		Variavel.Numero = Teclado.nextInt();
		Variavel.Numero1 = Teclado.nextInt();
		Variavel.Numero2 = Teclado.nextInt();
		
		System.out.println(Variavel.Multiplicacao_2());
		System.out.println(Variavel.Multiplicacao_3());
		
		Variavel.Numero = Teclado.nextInt();
		Variavel.Numero1 = Teclado.nextInt();
		Variavel.Numero2 = Teclado.nextInt();
		
		System.out.println(Variavel.Divisao_2());
		System.out.println(Variavel.Divisao_3());
	}


}
