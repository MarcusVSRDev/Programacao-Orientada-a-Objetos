package model;

public class Peixee extends Animal{ 
	
	public Peixee() {
		super.nome = nome;
		super.cor = cor;
		super.qntdPatas = 0;
	}

	public void dadosPeixe() {
		System.out.println("Nome: " + nome + "\n" +	"Quantidade de Patas: " + qntdPatas + "\n" + "Cor: " + cor);
	}
}
