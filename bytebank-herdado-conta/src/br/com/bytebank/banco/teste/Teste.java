package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
	    System.out.println("x");
	    System.out.println(3);
	    System.out.println(false);

	    ContaCorrente cc = new ContaCorrente(22, 33);
	    //Classe object mais geral, engloba todos os objetos (Conta, ContaCorrente, ContaPoupanca, Cliente (...))
	    //Todas as outras classes se extende da classe Object, sendo assim não é necessário cita-la
	    Conta cp = new ContaPoupanca(33, 22);
	    Object cliente = new Cliente();

	    System.out.println(cc.toString());
	    System.out.println(cp); // Se o método toString não for override na classe CP, isso retorna o Full Qualified Name + String da classe Object => br.com.bytebank.banco.modelo.ContaPoupanca@5ca881b5
	}

	  static void println() {}
	  static void println(int a) {}
	  static void println(boolean valor) {}
	  static void println(Object referencia) {
	  }
}
