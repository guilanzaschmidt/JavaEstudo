
public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente guilherme = new Cliente();
		guilherme.setNome("Guilherme");
		//conta.setTitular(guilherme);
		
		conta.setTitular(guilherme);
		System.out.println(conta.getTitular().getNome());
		
		guilherme.setCpf("233244535");
		conta.setTitular(guilherme);
		System.out.println(conta.getTitular().getcpf());
	}
}
