package Questao1;

public class Bimestre{
	private String idBimestre;
	private Avaliacao av1;
	private Avaliacao av2;
	private Avaliacao av3;
	
	public Bimestre(Avaliacao av1, Avaliacao av2, Avaliacao av3){
		this.av1 = av1;
		av1.GetInfo();
		av1.GetNota();
		this.av2 = av2;
		av2.GetInfo();
		av2.GetNota();
		this.av3 = av3;
		av3.GetInfo();
		av3.GetNota();
	}
	
	public void ImprimirAvaliacoes() {
		System.out.println("Tipo de avalição");
		System.out.println("- Prova");
		System.out.println("- Nome: " + this.av1.GetInfo());
		System.out.println("- Nota: " + this.av1.GetNota());
		
		System.out.println("Tipo de avaliação");
		System.out.println("- Estudo Dirigido");
		System.out.println("- Nome: " + this.av2.GetInfo());
		System.out.println("- Nota: " + this.av2.GetNota());
		
		System.out.println("Tipo de avaliação");
		System.out.println("- Seminário");
		System.out.println("- Nome: " + this.av3.GetInfo());
		System.out.println("- Nota: " + this.av3.GetNota());
	}

}
