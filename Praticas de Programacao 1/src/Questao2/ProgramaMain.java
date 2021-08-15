package Questao2;

public class ProgramaMain {
	public static void main(String[] args) {
		Programa programa = new Programa();
		programa.setNome("Jogo da Cobrinha");
		programa.setFabricante("Gremlin Industries");
		programa.setVersao("1.0");
		programa.setNumeroRegistro(321321);
		
		System.out.println("Nome: " + programa.getNome());
		System.out.println("Fabricante: " + programa.getFabricante());
		System.out.println("Versão: " + programa.getVersao());
		System.out.println("Registro: " + programa.getNumeroRegistro());
		
		programa.setNome("Minecraft");
		programa.setFabricante("Mojang");
		programa.setVersao("1.5.1");
		programa.setNumeroRegistro(2141241);
		
		System.out.println("\n" + "Nome: " + programa.getNome());
		System.out.println("Fabricante: " + programa.getFabricante());
		System.out.println("Versão: " + programa.getVersao());
		System.out.println("Registro: " + programa.getNumeroRegistro());
		
		
	}
}
