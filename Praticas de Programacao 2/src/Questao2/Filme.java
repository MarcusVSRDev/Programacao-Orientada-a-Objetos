package Questao2;

public class Filme extends ProdutoAudioVisual{
	
	private String Atores[];
	private boolean ganhouOscar;
	private int Duracao;
	
	public Filme(String iD, String titulo, int ano, String diretor, String uRL, String atores, boolean ganhouOscar,
			int duracao) {
		super(iD, titulo, ano, diretor, uRL);
		Atores[10] = atores;
		this.ganhouOscar = ganhouOscar;
		Duracao = duracao;
	}
	
	public void adicionarAtor(String Ator) {
		int i = 0;
		this.Atores[i] = Ator;
		i++;
	}
	public void removerAtor(String Ator) {
		
		int i = 10;
		int b = 10;
			while(b >= 0) {
				
			if(this.Atores[i] == Ator) {
				this.Atores[i] = null;
			}
			else {
				i--;
			}
		}
	}
	public void ganhouOscar(boolean Ganhou) {
		if(Ganhou == true) {
			this.ganhouOscar = true;
		}
		else {
			this.ganhouOscar = false;
		}
	}
	public void alterarDuracao(int Duracao) {
		this.Duracao = Duracao;
	}
}
