package Questao1;

public class ProdutoMain {
	public static void main(String[] args) {
		
		Chocolate Choco = new Chocolate("Chocolate Branco", "Nestle", 7.99);
		System.out.println("Nome: " +Choco.getNome());
		System.out.println("Marca: " + Choco.getMarca());
		System.out.println("Preço: R$" + Choco.getPreco());
		Automovel Carro = new Automovel("R8" , "Audi", 699.999);
		System.out.println("Nome: " + Carro.getNome());
		System.out.println("Marca: " + Carro.getMarca());
		System.out.println("Preço: R$" + Carro.getPreco());
		
	}

}
