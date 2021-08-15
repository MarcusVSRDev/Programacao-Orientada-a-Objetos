package Questao1;

public class Automovel implements IProduto{
	
	private String Nome;
	private String Marca;
	private double Preco;
	
	public Automovel(String nome, String marca, double preco) {
		super();
		Nome = nome;
		Marca = marca;
		Preco = preco;
	}

	public String getNome() {
		return Nome;
	}

	public String getMarca() {
		return Marca;
	}

	public double getPreco() {
		return Preco;
	}

}
