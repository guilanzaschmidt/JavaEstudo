
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente guilherme = new Cliente();
		guilherme.nome = "Guilherme Lanza Schmidt";
		guilherme.cpf = "22222222222";
		guilherme.profissao = "Analista";
		
		Conta contaGui = new Conta();
		contaGui.deposita(100);
		contaGui.titular.nome = "Guilherme";
	}

}
