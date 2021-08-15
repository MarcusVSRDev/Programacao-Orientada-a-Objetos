package model;

public class Mamifero extends Animal{
		private String tipoAlimentacao;
		
		public Mamifero() {
			super.cor = cor;
			super.nome = nome;
			super.qntdPatas = 0;
		}
		public void dadosMamifero() {
			System.out.println("Nome: " + nome + "\n" + "Cor: " + cor + "\n" + "Quantidade de patas: " + qntdPatas + "\n" + "Tipo de Alimentação: " + tipoAlimentacao + "\n");
		}
		
		public String getTipoAlimentacao() {
			return tipoAlimentacao;
		}
		
		public void setTipoAlimentacao(String tipoAlimentacao) {
			this.tipoAlimentacao = tipoAlimentacao;
		}
}
