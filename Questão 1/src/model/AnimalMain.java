package model;

public class AnimalMain {

	public static void main(String[] args) {
		Mamifero animal = new Mamifero();
		animal.nome = "Tigre";
		animal.cor = "Alaranjado";
		animal.qntdPatas = 4;
		animal.setTipoAlimentacao("Carnivoro");
		animal.dadosMamifero();
		animal.nome = "Leão";
		animal.cor = "Albino";
		animal.qntdPatas = 4;
		animal.setTipoAlimentacao("Carnivoro");
		animal.dadosMamifero();
		}
}
