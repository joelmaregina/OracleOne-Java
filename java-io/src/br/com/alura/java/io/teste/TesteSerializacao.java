package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//String nome = "Joelma Regina";
		//ObjectOutputStream aos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		//aos.writeObject(nome);
		//aos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome =  (String) ois.readObject();
		ois.close();
		System.out.println(nome);
		
		
	}
}
