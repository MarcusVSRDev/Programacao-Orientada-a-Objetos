import javax.swing.JOptionPane;

public class Gincana {
		//Atributos
		int Equipe1;
		int Equipe2;
		int Equipe3;
		int opcao1;
		int opcao2;
		int opcao3;
		int Remover;
		
		
		//Metodos
		Gincana(int Equipe1, int Equipe2, int Equipe3){
			this.Equipe1 = Equipe1;
			this.Equipe2 = Equipe2;
			this.Equipe3 = Equipe3;
			
		}
		
		void Inicio() throws InterruptedException {
			opcao1 = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar ou remover pontos?"+ "\n" + "1) Adicionar" + "\n" + "2) Remover" + "\n" + "3) Sair"));
			if(opcao1 == 1) {
				AdicionarPontos();
			}
			if(opcao1 == 2) {
				RetirarPontos();
			}
			if(opcao1 == 3) {
				mostrarRelatorio();
				Thread.sleep(5000);
				System.exit(0);
			}
		} 
		
		void AdicionarPontos() throws InterruptedException {
			opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Para qual equipe deseja adicionar pontos?" + "\n" + "1) Equipe1" + "\n" + "2) Equipe2" + "\n" + "3) Equipe3"));
			if(opcao2 == 1) {
				Equipe1 = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar quantos pontos para a equipe 1?"));
				Inicio();
			}
			if(opcao2 == 2) {
				Equipe2 = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar quantos pontos para a Equipe2?"));
				Inicio();
				
			}
			if(opcao2 == 3) {
				Equipe3 = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar quantos pontos para a Equipe3?"));
				Inicio();
			}
		}
		
		void RetirarPontos() throws InterruptedException {
			
			opcao3 = Integer.parseInt(JOptionPane.showInputDialog("Deseja remover pontos de qual equipe?" + "\n" + "1) Equipe1" + "\n" + "2) Equipe2" + "\n" + "3) Equipe3"));
			if(opcao3 == 1) {
				Remover = Integer.parseInt(JOptionPane.showInputDialog("Quantos pontos deseja retirar da Equipe1?"));
				Equipe1 = Equipe1 - Remover;
				Inicio();
				
			}
			if(opcao3 == 2) {
				Remover = Integer.parseInt(JOptionPane.showInputDialog("Quantos pontos deseja retirar da Equipe2?"));
				Equipe2 = Equipe2 - Remover;
				Inicio();
				
			}
			if(opcao3 == 3) {
				Remover = Integer.parseInt(JOptionPane.showInputDialog("Quantos pontos deseja retirar da Equipe3?"));
				Equipe3 = Equipe3 - Remover;
				Inicio();
			}
			
		}
		
		void mostrarRelatorio() {
			
			if(Equipe1 > Equipe2 && Equipe2 > Equipe3) {
				
				System.out.println( "Pontuação");
				System.out.println("Equipe1 " + Equipe1);
				System.out.println("Equipe2 " + Equipe2);
				System.out.println("Equipe3 " + Equipe3);
				
			}
			if(Equipe1 > Equipe2 && Equipe2 < Equipe3) {
			
				System.out.println( "Pontuação");
				System.out.println("Equipe1 " + Equipe1);
				System.out.println("Equipe3 " + Equipe3);
				System.out.println("Equipe2 " + Equipe2);
				
			}
			if(Equipe2 > Equipe1 && Equipe1 > Equipe3){
				
				System.out.println( "Pontuação");
				System.out.println("Equipe2 " + Equipe2);
				System.out.println("Equipe1 " + Equipe1);
				System.out.println("Equipe3 " + Equipe3);
				
			}
			if(Equipe2 > Equipe1 && Equipe1 < Equipe3){
				
				System.out.println( "Pontuação");
				System.out.println("Equipe2 " + Equipe2);
				System.out.println("Equipe3 " + Equipe3);
				System.out.println("Equipe1 " + Equipe1);
				
			}
			if(Equipe3 > Equipe1 && Equipe1 > Equipe2) {
				
				System.out.println( "Pontuação");
				System.out.println("Equipe3 " + Equipe3);
				System.out.println("Equipe1 " + Equipe1);
				System.out.println("Equipe2 " + Equipe2);
				
			}
			if(Equipe3 > Equipe1 && Equipe1 < Equipe2) {
				
				System.out.println( "Pontuação");
				System.out.println("Equipe3 " + Equipe3);
				System.out.println("Equipe2 " + Equipe2);
				System.out.println("Equipe1 " + Equipe1);
				
			}
		}
}
