package br.com.bytebank.banco.teste;

//CTRL + SHIFT + O = Importa todos os metodos espec�ficos necess�rios para rodar compilar o c�digo:
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
	public static void main(String[] args) throws SaldoInsuficienteException {

		//Full QUalified Name FQN: modelo."nome da classe/interface"
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca (222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("O saldo CP ap�s a tranfer�ncia �: " + cp.getSaldo());
		System.out.println("O saldo CC ap�s a tranfer�ncia �: " + cc.getSaldo());

	}
}
