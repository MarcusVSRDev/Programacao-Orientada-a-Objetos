package Questao_1;

public class ConversorUnidadeTempoMain {
	public static void main(String[] args) {
		
		ConversorUnidadeTempo tempo = new ConversorUnidadeTempo(1, 1, 1, 1, 1, 1, 1);
		tempo.ConversorMinutos();
		tempo.ConversorHoras();
		tempo.ConversorDias();
		tempo.ConversorSemanas();
		tempo.ConversorMes();
		tempo.ConversorAno();
	}

}
