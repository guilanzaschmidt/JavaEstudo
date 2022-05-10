
public class TesteReferencias {

	public static void main(String[] args) {
		 
		Funcionario g1 = new Gerente();
		g1.setNome("Paulo");
		g1.setSalario(5000.00);	
		System.out.println(g1.getNome());
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		//System.out.println(controle.getSoma());

		
		System.out.println(controle.getSoma());
		
	}
}
