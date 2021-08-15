package Questao1;

public class SmartPhone extends Computador {
	
	private String tamanhadoDaTela;
	private String densidadePixels;
	private String Operadora;

	public SmartPhone(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria, String
			tamanhoDaTela, String densidadePixels, String Operadora) {
		super(fabricante, processador, memoriaPrincipal, memoriaSecundaria);
		this.densidadePixels = densidadePixels;
		this.Operadora = Operadora;
		this.tamanhadoDaTela = tamanhoDaTela;
	}
	public void TrocarOperadora(String Operadora) {
		this.Operadora = Operadora;
	}
}
