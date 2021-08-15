package Questao1;

public class BimestreTesteMain {
	
	public static void main(String[] args) {
		Avaliacao Prova = new Prova("Marcus", 7.5, 60, 45, true);
		Avaliacao EstudoDirigido = new EstudoDirigido("Marcus", 6.25, "História do Brasil", 32);
		Avaliacao Seminario = new Seminario("Marcus", 8.65, "2º Guerra Mundial", 15);
		Bimestre n = new Bimestre(Prova, EstudoDirigido, Seminario);
		n.ImprimirAvaliacoes();
	}
}
