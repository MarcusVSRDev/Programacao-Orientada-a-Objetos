
public class EmprestimosDeLivros 
{
		// Attributes
	
	int QuantidadeLivro;
	String Nome;
	String Autor;
	String Genero;
	String Nome_Pessoa = "Marcus Vinicius";
	String Data = "31/05/2021";
	
	
		// Metodos
	
	void LivroDisponivel() {
		
	System.out.println("O livro " + Nome + " esta disponivel! \n");
	System.out.println("O genêro do livro é: " + Genero + " \n");
	System.out.println("O autor(a) do livro é: " + Autor + " \n");

	}
	void LivroIndisponivel() {
		
	System.out.println("O livro " + Nome + ", esta emprestado ate " + Data + "para o (a) " + Nome_Pessoa + "\n");
	
	}
}
