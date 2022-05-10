
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaGui = new Conta();
		
		contaGui.saldo = 100;
		
		contaGui.deposita(50);
		System.out.println(contaGui.saldo);
		
		boolean retirar = contaGui.saca(20);
		System.out.println(contaGui.saldo);
		System.out.println(retirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		contaMarcela.transfere(300, contaGui);
		System.out.println(contaMarcela.saldo);
		System.out.println(contaGui.saldo);
	}
}
