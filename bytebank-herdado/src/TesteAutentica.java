
public class TesteAutentica {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(222);
		
		Adminstrador adm = new Adminstrador();
		adm.setSenha(333);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
	}
}
