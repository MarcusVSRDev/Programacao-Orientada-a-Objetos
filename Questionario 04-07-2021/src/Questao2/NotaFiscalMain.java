package Questao2;

public class NotaFiscalMain {
	
	public static void main (String[] args) {
		Pagamento Compra = new PagamentoDinheiro(30, 35);
		Pagamento Compra1 = new PagamentoCartao(45, "Visa", 328132871);
		NotaFiscal Nota = new NotaFiscal(83281, "Cola-Cola 2.5L - 5 Unid.", Compra);
		NotaFiscal Nota1 = new NotaFiscal(83281, "Cola-Cola 2.5L - 5 Unid.", Compra1);
		Nota.ImprimirNota();
		Nota1.ImprimirNota();
	}

}
