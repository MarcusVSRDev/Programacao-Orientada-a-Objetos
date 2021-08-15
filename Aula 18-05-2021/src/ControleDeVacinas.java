
public class ControleDeVacinas 
{

	public static void main(String[] args) 
	{
			VacinaCOVID vac1 = new VacinaCOVID();
			VacinaCOVID vac2 = new VacinaCOVID();
			vac1.nome = "CoronaVAC";
			vac1.quantidadeDeDoses = 2;
			
			vac2.nome = "AstraZeneca";
			vac2.quantidadeDeDoses = 1;
			
			System.out.println(vac1.nome);
			System.out.println(vac2.nome);
			System.out.println(vac1.DoseUnica());
			System.out.println(vac2.DoseUnica());
	}

}

