public class Pessoa 
{
	public static void main (String[] args) {
		
		CadernoDeEnderecos av1 = new CadernoDeEnderecos();

		
		av1.Email = "Fulano@Mail.com";
		av1.Endereco = "Taguatinga Norte, Setor Habitacional Vicente Pires, Rua 03, Chacara 70, Lote 02";
		av1.Telefone = "(61)912345678";
		
		av1.MostrarEnderecos();
	}
}
