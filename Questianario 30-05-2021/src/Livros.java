
public class Livros 
{
	public static void main (String[] args) 
	{
		
		//Atributos 
		
		EmprestimosDeLivros av1 = new EmprestimosDeLivros();
		EmprestimosDeLivros av2 = new EmprestimosDeLivros();
		EmprestimosDeLivros av3 = new EmprestimosDeLivros();
		
		av1.Nome = "Harry Potter e a Pedra Filosofal";
		av2.Nome = "Harry Potter e a Camara Secreta";
		av3.Nome = "Harry Potter e o Calice de Fogo";
		
		
		av1.QuantidadeLivro = 1;
		av2.QuantidadeLivro = 0;
		av3.QuantidadeLivro = 1;
		
		av1.Autor = "J. K. Rowling";
		av2.Autor = "J. K. Rowling";
		av3.Autor = "J. K. Rowling";
		
		av1.Genero = "Ação, Aventura e Fantasia";
		av2.Genero = "Ação, Aventura e Fantasia";
		av3.Genero = "Ação, Aventura e Fantasia";
		
		//Metodos
		
		if(av1.QuantidadeLivro == 1)
		{
			av1.LivroDisponivel();
		}
		
		if(av1.QuantidadeLivro == 0){
			av1.LivroIndisponivel();
		}
		
		if(av2.QuantidadeLivro == 1) {
			
			av2.LivroDisponivel();

		}
		
		if(av2.QuantidadeLivro == 0) {
			av2.LivroIndisponivel();
		}
		
		if(av3.QuantidadeLivro == 1) {
			
			av3.LivroDisponivel();
		}
		
		if(av3.QuantidadeLivro == 0) {
			av3.LivroIndisponivel();
		}
	}
}
