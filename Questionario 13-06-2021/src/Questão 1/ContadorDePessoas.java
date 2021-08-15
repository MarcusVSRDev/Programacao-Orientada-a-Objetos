import javax.swing.JOptionPane;

public class ContadorDePessoas {
	
	//Atributos
	int limitePessoas;
	int qntdPresente;
	int qntdTotal;
	int saida;
	int entrada;
	int opcao;
	
	//Metodos
	ContadorDePessoas(int limite, int limitePessoas, int qntdPresente, int qntdTotal, int saida, int entrada){
		this.limitePessoas = limitePessoas;
		this.qntdPresente = qntdPresente;
		this.qntdTotal = qntdTotal;
		this.saida = saida;
		this.entrada = entrada;
		
	}
	void Inicio() {
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja registrar a entrada ou a saida de pessoas?" + "\n" + "1 = Entrada" + "\n " + "2 = Saida"));
		if(opcao == 1) {
			registraEntrada(0);
		}
		else{
			registraSaida(0);
		}
	}
	void registraEntrada(int quantidade){
			
		if(qntdPresente <= limitePessoas){
			entrada = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas entraram no restaurante?"));
			qntdPresente = qntdPresente + entrada;
			qntdTotal = qntdTotal + entrada;
			Inicio();
			if(qntdPresente >= limitePessoas) {
				System.out.println("O Restaurante não permite mais do que 20 pessoas.");
				qntdPresente = qntdPresente - entrada;
				qntdTotal = qntdTotal - entrada;
				entrada = 0;
			}
		}
		else {
			System.out.println("O Restaurante está com o maximo de pessoas presente. Por favor, aguarde a saída de alguém.");
		}
	}
	void registraSaida(int quantidade){
		if(qntdPresente <= 0){
			System.out.println("O número de pessoas no restaurante não pode ser negativo");
			this.qntdPresente = 0;
		}
		else{
			saida = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas saírão do restaurante?"));
			qntdPresente = qntdPresente - saida;
			qntdTotal = qntdTotal + qntdPresente;
			Inicio();
		}
		
	}
	String mostrarRelatorio(){
		String Relatorio = "Quantidade de pessoas presente: " + qntdPresente + "\n";
		Relatorio += "Limite de pessoas: " + limitePessoas + "\n";
		Relatorio += "Total de pessoas hoje: " + qntdTotal + "\n";
		return Relatorio;
	}
}
