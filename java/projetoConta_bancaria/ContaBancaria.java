package exercicios;

public class ContaBancaria {

	private int numeroConta;
	private double saldo;
	// private transacoes; tipo?
	
	
	public void emitirExtrato(int numeroConta, double saldo) {
		return ("Conta: %d Saldo %.2f",numeroConta,saldo);
	}
	
	
}
