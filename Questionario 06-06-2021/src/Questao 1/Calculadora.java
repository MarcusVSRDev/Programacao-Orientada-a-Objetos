
public class Calculadora {
	//Atributos
	
	 int Valor1;
	 int Valor2;
	 int Valor3;
	 int soma;
	 int subtracao;
	 int multiplicacao;
	 float divisao;

	Calculadora(int Valor1){
		this.Valor1 = Valor1;
		
	}
	Calculadora(int Valor1, int Valor2){
		this.Valor1 = Valor1;
		this.Valor2 = Valor2;
		
	}
	Calculadora(int Valor1, int Valor2, int Valor3){
		this.Valor1 = Valor1;
		this.Valor2 = Valor2;
		this.Valor3 = Valor3;
		
		soma = Valor1 + Valor2 + Valor3;
		subtracao = Valor1 - Valor2 - Valor3;
		multiplicacao = Valor1 * Valor2 * Valor3;
		divisao = (float)Valor1/Valor2/Valor3;
	}
	//Metodos
	String GerarCalculo() {
		String Calculo = "   " + this.soma + "\n";
		Calculo += "   " + this.subtracao + "\n";
		Calculo += "   " + this.multiplicacao + "\n";
		Calculo += "   " + this.divisao;
		return Calculo;		
	}

}
