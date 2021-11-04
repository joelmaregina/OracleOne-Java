package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket();
		
		InputStream fis =  s.getInputStream(); //rede
		//System.in; Pega o Input do teclado
		// new FileInputStream("lorem.txt"); (Realiza c�pia do arquivo indicado)
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = s.getOutputStream(); //rede
		//System.out; Lan�a o input pro console
		//new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha != null  && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush(); // Escreve uma c�pia da frase no console a cada linha digitada (P�ra apos uma linha vazia)
			linha = br.readLine();
		}
		
		
		br.close();
		bw.close();
		
	}

}
