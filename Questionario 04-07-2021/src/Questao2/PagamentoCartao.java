package Questao2;

public class PagamentoCartao extends Pagamento{
	private String Bandeira;
	private long NumeroTrasacao;

	public PagamentoCartao(double Valor, String Bandeira, long NumeroTransacao) {
		super(Valor);
		this.Bandeira = Bandeira;
		this.NumeroTrasacao = NumeroTransacao;
		
	}
	
	public String Imprimir() {
		String Resumo = "Cartão" + "\n" + "Valor total: R$" + this.Valor + "\n";
		Resumo += "Bandeira do cartão: " + this.Bandeira + "\n";
		Resumo += "Numero da transação: " + this.NumeroTrasacao + "\n";
		return Resumo;
	}

}
