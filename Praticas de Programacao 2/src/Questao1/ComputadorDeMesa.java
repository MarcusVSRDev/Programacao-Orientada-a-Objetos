package Questao1;

public class ComputadorDeMesa extends Computador {
	
	private String FabricanteGabinete;
	private String TipoGabinete;
	private String Fonte;

	public ComputadorDeMesa(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria, String 
			FabricanteGabinete, String TipoGabinete, String Fonte) {
		super(fabricante, processador, memoriaPrincipal, memoriaSecundaria);
		this.FabricanteGabinete = FabricanteGabinete;
		this.TipoGabinete = TipoGabinete;
		this.Fonte = Fonte;
	}
	public void TrocarFabricanteGabinete (String fGabinete) {
		
		this.FabricanteGabinete = fGabinete;
	}
	public void TrocarTipoGabinete (String tipoGabinete) {
		this.TipoGabinete = tipoGabinete;
	}
	public void TrocarFonte (String Fonte) {
		this.Fonte = Fonte;
	}
}
