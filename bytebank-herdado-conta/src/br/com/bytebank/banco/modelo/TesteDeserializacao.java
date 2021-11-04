package br.com.bytebank.banco.modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacao {
	
	//A criação de um objeto a partir de um um fluxo binário é chamado de desserialização;
	//A serialização/desserialização funciona em cascata e também com herança;

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(cc.getSaldo());
		System.out.println(cc.getTitular());
	}

}
