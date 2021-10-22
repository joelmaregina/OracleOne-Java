package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
		// Impede criar uma conta com uma agência e numero que possuem valores negativos
        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
	@Override
	public String toString() {
		return "Conta Poupança" + super.toString();
	}
	
}
