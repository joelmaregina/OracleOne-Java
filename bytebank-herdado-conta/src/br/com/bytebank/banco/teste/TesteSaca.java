package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

class TesteSaca {
	public static void main(String[] args) {
		Object conta = new ContaCorrente (123, 321);
		((Conta) conta).deposita(200.00);
		//SaldoInsuficienteException ou apenas Exception:
		try {
			((Conta) conta).saca(210.00);
		}catch (SaldoInsuficienteException ex) {
			System.out.println("EX: " + ex.getMessage());
		}
		
		System.out.println(((Conta) conta).getSaldo());
	}
}
