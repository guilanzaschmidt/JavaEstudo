
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil util;
	
	public Gerente() {
		this.util = new AutenticacaoUtil();
		
	}
	
	public double getBonus() {
		return super.getBonus() + super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		this.util.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}
	
}
