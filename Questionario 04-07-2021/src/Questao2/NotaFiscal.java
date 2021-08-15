package Questao2;

public class NotaFiscal {
	private int Numero;
	String Resumo;
	Pagamento pagamento;
	
	public NotaFiscal(int Numero, String Resumo, Pagamento pagamento) {
		super();
		this.Numero = Numero;
		this.Resumo = Resumo;
		this.pagamento = pagamento;
	}

	public void ImprimirNota() {
		System.out.println("Nota Fiscal Número: " + Numero);
		System.out.println("Resumo da compra: " + Resumo);
		System.out.println("Forma de pagamento: " + pagamento.Imprimir());
	}
}
