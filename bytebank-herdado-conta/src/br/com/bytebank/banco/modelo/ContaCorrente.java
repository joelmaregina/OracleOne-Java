package br.com.bytebank.banco.modelo;

//new ContaCorrente();
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		// Impede criar uma conta com uma ag�ncia e numero que possuem valores negativos
        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inv�lida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inv�lido");
        }
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente" + super.toString();
	}
	
}
