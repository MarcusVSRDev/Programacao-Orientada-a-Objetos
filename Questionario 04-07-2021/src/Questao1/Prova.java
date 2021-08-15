package Questao1;

public class Prova extends Avaliacao{
	
	private double Tempo;
	private int qntdQuestoes;
	private boolean Consulta;
	
	Prova(String nome, double nota, double Tempo, int qntdQuestoes, boolean Consulta) {
		super(nome, nota);
		this.Tempo = Tempo;
		this.qntdQuestoes = qntdQuestoes;
		this.Consulta = Consulta;
	}

}
