
public class Main {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Marcus Vinicius", "073.802.932-10");
		System.out.println(pessoa1.GerarPessoa());
		
		Endereco endereco1 = new Endereco("Casa", 2, "Uma rua acima do Society", "Setor Habitacional Samambaia", "Taguatinga", "72002-190");
		System.out.println(endereco1.GerarResumo());
	}
	
	static void Info() {
		Endereco endereco1 = new Endereco("", 0, "", "", "", "");
		Pessoa pessoa1 = new Pessoa("", "");
	}

}
