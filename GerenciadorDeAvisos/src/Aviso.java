
public class Aviso 
{
		// Atributos
		
			String Mensagem;
			String linkImagem;
			int quantidadeDeExibicoes;
			
		// Métodos
			
			void MostrarMensagem() {
				System.out.println(Mensagem);
				quantidadeDeExibicoes--;
			}
			
			boolean dataEncerramento( ) {
				if(quantidadeDeExibicoes > 0) {
					return true;
				}
				else {
					return false;
				}
			}	
}
