package Questao1;

public class Computador {
	private String Fabricante;
	private String processador;
	private String MemoriaPrincipal;
	private String MemoriaSecundaria;
	
	public Computador(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria) {
		super();
		Fabricante = fabricante;
		this.processador = processador;
		MemoriaPrincipal = memoriaPrincipal;
		MemoriaSecundaria = memoriaSecundaria;
	}
	public void trocarProcessador (String Processador) {
		this.processador = Processador;
	}
	public void trocarMemoriaPrincipal (String Memoria) {
		this.MemoriaPrincipal = Memoria;
	}
	public void trocarMemoriaSecundaria (String Memoria) {
		this.MemoriaSecundaria = Memoria;
	}
}
