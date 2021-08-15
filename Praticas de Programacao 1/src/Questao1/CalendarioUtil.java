package Questao1;

import java.util.Calendar;

public class CalendarioUtil {
	static Calendar cal = Calendar.getInstance();
	
	public static void Data() {
		System.out.println("Data: " + cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR));
	}
	
	public static void Ano() {
		System.out.println("Ano: " + cal.get(Calendar.YEAR));	
	}
	
	public static void Mes() {
		System.out.println("Mês: " + cal.get(Calendar.MONTH));
	}
	
	public static void Dia() {
		System.out.println("Dia: " + cal.get(Calendar.DATE));
	}
	
	public static void Hora() {
		System.out.println("Hora: " + cal.get(Calendar.HOUR));
	}
	
	public static void Minuto() {
		System.out.println("Minutos: " + cal.get(Calendar.MINUTE));
	}
	
	public static void Segundo() {
		System.out.println("Segundos: " + cal.get(Calendar.SECOND));
	}
}