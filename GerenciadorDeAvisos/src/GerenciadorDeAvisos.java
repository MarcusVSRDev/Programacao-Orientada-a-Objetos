
public class GerenciadorDeAvisos 
{
	public static void main(String[] args) throws InterruptedException{
		Aviso av1 = new Aviso();
		Aviso av2 = new Aviso();
		Aviso av3 = new Aviso();
		
		av1.Mensagem = "Não se esqueça de jogar Sea Of Thieves com os guri";
		av2.Mensagem = "Não se esqueça de fazer todas as tarefas da facool, mongolão";
		av3.Mensagem = "E pare de dormir tarde e fuder teu horário, já já tu tá com o horário errado denovo";
		
		av1.quantidadeDeExibicoes = 10;
		av2.quantidadeDeExibicoes = 5;
		av3.quantidadeDeExibicoes = 3;
		
		while(av1.dataEncerramento() || av2.dataEncerramento() || av3.dataEncerramento()) {
		
		if(av1.dataEncerramento())
		{
			Thread.sleep(2000);
			System.out.println("- - - - -");
			av1.MostrarMensagem();
		}
		
		if(av2.dataEncerramento())
		{
			Thread.sleep(2000);
			System.out.println("- - - - -");
			av2.MostrarMensagem();
		}
		
		if(av3.dataEncerramento())
		{
			Thread.sleep(2000);
			System.out.println("- - - - -");
			av3.MostrarMensagem();
		}
		
		}
	}
}
