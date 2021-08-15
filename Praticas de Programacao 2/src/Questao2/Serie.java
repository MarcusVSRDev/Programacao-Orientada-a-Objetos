package Questao2;

public class Serie extends ProdutoAudioVisual {
	private String Atores[];
	private int Temporadas;
	
	public Serie(String iD, String titulo, int ano, String diretor, String uRL, String atores, int temporadas) {
		super(iD, titulo, ano, diretor, uRL);
		Atores[10] = atores;
		Temporadas = temporadas;
	}

	public void adicionarAtor (String ator) {
		int i = 0; 
		this.Atores[i] = ator;
		i++;
	}
	public void removerAtor (String ator) {
			int i = 10;
			int b = 10;
			while(b >= 0) {
				
			if(this.Atores[i] == ator) {
				this.Atores[i] = null;
			}
			else {
				i--;
			}
		}
	}
	public void alterarNumTemporadas (int num) {
		this.Temporadas = num;
	}

}
