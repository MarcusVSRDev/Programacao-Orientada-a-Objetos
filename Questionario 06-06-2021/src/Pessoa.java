
public class Pessoa {
	
	//Attributes
	String Nome;
	String CPF;
	
	Pessoa(){
		
	}
	Pessoa(String Nome, String CPF){
		this.Nome = Nome;
		if(CPF.length() == 14)
		{
			this.CPF = CPF;
		}
		else
		{
			System.err.println("Digite um CPF valido");
		}
		
	}

	//Metodos
	String GerarPessoa(){
		String Pessoa = "O(A) " + Nome + " do CPF " + CPF + "\n";
		return Pessoa;
		
	}
}