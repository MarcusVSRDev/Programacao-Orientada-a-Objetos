public class Endereco {

	//Atributtes
	String Logradouro;
	int Numero;
	String Complemento;
	String Bairro;
	String Cidade;
	String Cep;
	
	Endereco(){
		
	}
	Endereco(String Logradouro, int Numero, String Complemento, String Bairro, String Cidade, String Cep){
		this.Logradouro = Logradouro;
		this.Bairro = Bairro;
		this.Complemento = Complemento;
		this.Cidade = Cidade;
		this.Cep = Cep;
		if(Numero > 0)
		{
			this.Numero = Numero;
		}
		else
		{
			System.err.println("Digite o numero da casa correto");
		}
		
	}
	
	//Metodos
	String GerarResumo() {
		String Resumo = "Mora numa " + this.Logradouro + "cujo endereço é:" + "\n";
		Resumo += "Cidade: "  + Cidade + "\n" + "Bairro: " + Bairro + "\n" + "Casa numero: " + Numero + "\n" + "Complemento: " + Complemento + "\n" + "CEP: " + Cep;
		return Resumo;
	}
}