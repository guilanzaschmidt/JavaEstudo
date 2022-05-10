
public class Cliente implements Autenticavel {

	private AutenticacaoUtil util;
	
	public Cliente() {
		this.util = new AutenticacaoUtil();
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
