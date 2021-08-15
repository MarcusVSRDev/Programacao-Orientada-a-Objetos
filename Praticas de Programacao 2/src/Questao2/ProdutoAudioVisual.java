package Questao2;

public class ProdutoAudioVisual{
	private String ID;
	private String Titulo;
	private int Ano;
	private String Diretor;
	private String URL;
	
	public ProdutoAudioVisual(String iD, String titulo, int ano, String diretor, String uRL) {
		super();
		ID = iD;
		Titulo = titulo;
		Ano = ano;
		Diretor = diretor;
		URL = uRL;
	}
	
	public void alterarTitulo (String Titulo) {
		this.Titulo = Titulo;
	}
	public void alterarrAno (int Ano) {
		this.Ano = Ano;
	}
	public void alterarDiretor(String Diretor) {
		this.Diretor = Diretor;
	}
	public void alterarURL (String URL) {
		this.URL = URL;
	}
}
