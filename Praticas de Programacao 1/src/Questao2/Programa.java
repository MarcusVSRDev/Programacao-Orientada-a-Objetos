package Questao2;

public class Programa {
	private String Nome;
	private String Versao;
	private String Fabricante;
	private long numeroRegistro;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getVersao() {
		return Versao;
	}
	public void setVersao(String versao) {
		Versao = versao;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public long getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(long numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

}
