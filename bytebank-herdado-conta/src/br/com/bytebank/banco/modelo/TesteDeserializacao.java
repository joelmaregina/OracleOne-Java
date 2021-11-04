package br.com.bytebank.banco.modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacao {
	
	//A cria��o de um objeto a partir de um um fluxo bin�rio � chamado de desserializa��o;
	//A serializa��o/desserializa��o funciona em cascata e tamb�m com heran�a;

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(cc.getSaldo());
		System.out.println(cc.getTitular());
	}

}
