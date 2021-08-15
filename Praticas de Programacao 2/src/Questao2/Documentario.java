package Questao2;

public class Documentario extends ProdutoAudioVisual {
	
	private boolean ganhouOscar;
	private int Duracao;
	
	public Documentario(String iD, String titulo, int ano, String diretor, String uRL, boolean ganhouOscar,
			int duracao) {
		super(iD, titulo, ano, diretor, uRL);
		this.ganhouOscar = ganhouOscar;
		Duracao = duracao;
	}
	public void ganhouOscar(boolean ganhou) {
		if(ganhou == true) {
			this.ganhouOscar = true;
		}
		else {
			this.ganhouOscar = false;
		}	
	}
	
	public void alterarDuracao(int duracao) {
		this.Duracao = duracao;
	}
}
