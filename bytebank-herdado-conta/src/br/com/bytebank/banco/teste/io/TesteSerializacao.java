package br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//A cria��o do fluxo bin�rio a partir de um objeto � chamado de serializa��o;
		//A serializa��o/desserializa��o funciona em cascata e tamb�m com heran�a;
		
		Cliente cliente = new Cliente();
		cliente.setNome("Joelma");
		cliente.setProfissao("Dev");
		cliente.setCpf("12345678");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(222.3);
		
		String nome = "Joelma Regina";
		ObjectOutputStream aos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		aos.writeObject(cc);
		aos.close();
		
	}
}
