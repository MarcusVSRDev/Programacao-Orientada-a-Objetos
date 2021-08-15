package Questao1;

public class Main {

	public static void main (String[] args) {
		ComputadorDeMesa Computador = new ComputadorDeMesa("Pichau", "Intel Core I7 4970K", "HyperX 8GB DDR4", "HyperX 8GB DDR4", "Gigabyte", "Gabinete LED de Vidro", "Corsair 700w");
		SmartPhone Celular = new SmartPhone("Apple", "Quadcom 840", "4GB de Ram", null, "6.3 Polegadas", "3840x2160", "Claro");
		
		Computador.trocarProcessador("AMD Ryzen 5 3600x");
		Computador.trocarMemoriaPrincipal("Corsair 16GB DDR4");
		Computador.TrocarFonte("Corsair 650w");
		Computador.TrocarFabricanteGabinete("Corsair");
		Celular.TrocarOperadora("Vivo");
	}
}
