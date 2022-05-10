
public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario f) {
		
		double b = f.getBonus();
		this.soma = this.soma + b;
		
	}
	
	public double getSoma() {
		return soma;
	}
	
}
