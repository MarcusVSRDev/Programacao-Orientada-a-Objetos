package Questao2;

public class PagamentoDinheiro extends Pagamento {
	private double ValorRecebido;
	private double Troco;

	public PagamentoDinheiro(double Valor, double ValorRecebido) {
		super(Valor);
		this.ValorRecebido = ValorRecebido;
		this.Troco = ValorRecebido - Valor;
		
	}

	public String Imprimir() {
		String Resumo = "Dinheiro" + "\n" + "Valor total: R$" + this.Valor + "\n";
		Resumo += "Valor recebido: R$" + this.ValorRecebido + "\n";
		Resumo += "Troco: R$" + this.Troco + "\n";
		return Resumo;
	}
}
