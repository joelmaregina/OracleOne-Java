package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayRefer�ncias {
	public static void main(String[] args) {
		
		Object [] referencias = new Object[5];		
		ContaCorrente cc1 = new ContaCorrente (22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca (22, 22);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//System.out.println(cc2.getNumero());

		
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast - Voc� avisa ao compilador que o c�digo ir� funcionar
		//convertemos uma refer�ncia gen�rica para uma refer�ncia mais espec�fica
		//Outra forma de acessar o mesmo n�mero acima:
		System.out.println(ref.getNumero());
		System.out.println(cc2.getNumero());
	} 
}
