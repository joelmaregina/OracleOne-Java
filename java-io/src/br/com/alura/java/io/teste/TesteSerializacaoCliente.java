package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Cliente cliente = new Cliente();
		//cliente.setNome("Joelma");
		//cliente.setProfissao("Dev");
		//cliente.setCpf("12345678");
		
		//String nome = "Joelma Regina";
		//ObjectOutputStream aos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		//aos.writeObject(cliente);
		///aos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente =  (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getCpf());	
	}
}
