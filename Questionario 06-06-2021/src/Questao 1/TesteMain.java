
public class TesteMain {
	
	public static void main(String[] args) {
		Calculadora valor = new Calculadora(10, 10, 10);
		System.out.println(valor.GerarCalculo());
		
	}
	
	static void Teste() {
		
		Calculadora valor = new Calculadora(0, 0, 0);
		valor.soma = 0;
		valor.subtracao = 0;
		valor.divisao = 0;
		valor.multiplicacao = 0;
	}
}
