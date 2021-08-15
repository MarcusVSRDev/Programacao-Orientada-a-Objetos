package Questao1;

public abstract class Avaliacao {
		protected String nome;
		private double nota;
		
		Avaliacao(String nome, double nota){
			this.nome = nome;
			this.nota = nota;
			
		}
		double GetNota() {
			return nota;
		}
		String GetInfo() {
			return nome;
		}
}
