
public class VacinaCOVID 
{
		//Attributes
	
	String nome;
	String fabricante;
	int quantidadeDeDoses;
	int intervaloDeDoses;
	double custo;
	double eficacia;
	
		//Metodos
	
	boolean DoseUnica() {
		if(quantidadeDeDoses == 1) {
			return true;
		}
		else {
			return false;
		}
	}
}
