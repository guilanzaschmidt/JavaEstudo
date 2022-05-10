
public class TestFuncionario {

	public static void main(String[] args) {
		
	Funcionario funcionario = new Gerente();
	
	funcionario.setNome("Guilherme");
	funcionario.setCpf("654651");
	funcionario.setSalario(1000);
	
	System.out.println(funcionario.getNome());
	System.out.println(funcionario.getBonus());
	
	}
}
