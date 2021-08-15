package Questao_1;

public class ConversorUnidadeTempo {
	//Atributos
	
		protected int Segundos;
		protected int Minutos;
		protected int Horas;
		protected int Dias;
		protected int Semanas;
		protected int Mes;
		protected int Ano;
		
	//Metodos
		
		public ConversorUnidadeTempo(int Segundos, int Minutos, int Horas, int Dias, int Semanas, int Mes, int Ano){
			this.Segundos = Segundos;
			this.Minutos = Minutos;
			this.Horas = Horas;
			this.Dias = Dias;
			this.Semanas = Semanas;
			this.Mes = Mes;
			this.Ano = Ano;
		}
		
		public void ConversorAno() {
			if(Ano >= 1) {
				this.Dias = Ano * 365;
				System.out.println(Ano + " Ano(s)" + " equivale a " + Dias + " Dia(s)");
			}
		}
		
		public void ConversorMes() {
			if(Mes >= 1) {
				this.Dias = Mes * 30;
				System.out.println(Mes + " Mes(es)" + " equivale a " + Dias + " Dia(s)");
			}
		}
		
		public void ConversorSemanas() {
			if(Semanas >= 1) {
				this.Dias = Semanas * 7;
				System.out.println(Semanas + " Semana(s)" + " equivale a " + Dias + " Dia(s)");
			}
		}
		
		public void ConversorDias(){
			if(Dias >= 1) {
				this.Horas = Dias * 24;
				System.out.println(Dias + " Dia(s)" + " equivale a " + Horas + " Hora(s)");
			}
		}
		
		public void ConversorHoras(){
			if(Horas >= 1) {
				this.Minutos = Horas * 60;
				System.out.println(Horas + " Hora(s)" + " equivale a " + Minutos + " Minuto(s)");
			}
		}
		
		public void ConversorMinutos(){
			if(Minutos >= 1) {
				this.Segundos = Minutos * 60;
				System.out.println(Minutos + " Minuto(s)" + " equivale a " + Segundos + " Segundo(s)");
			}	
		}

}
