package model;

public class AnimaisMain {

	public static void main(String[] args) {
		Mamifero mamifero = new Mamifero();
		mamifero.nome = "Camelo";
		mamifero.cor = "Amarelo";
		mamifero.qntdPatas = 4;
		mamifero.setTipoAlimentacao("Carnivoro");
		mamifero.dadosMamifero();
	
		mamifero.nome = "Urso-do-Canadá";
		mamifero.cor = "Vermelho";
		mamifero.setTipoAlimentacao("Mel");
		mamifero.dadosMamifero();
		
		Peixee peixe = new Peixee();
		peixe.nome = "Tubarão";
		peixe.qntdPatas = 0;
		peixe.cor = "Cinzento";
		peixe.dadosPeixe();
		
		
	}
}
