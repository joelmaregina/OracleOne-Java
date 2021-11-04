package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
			
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US); //coloca ponto (".") nos double's
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			System.out.format( new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f %n" , tipoConta, agencia, numero, titular, saldo); 
			
			//%04d - Adiciona 2 zeros ao inicio do numero (total 4 numeros)
			//%08d - Adiciona 6 zeros ao inicio do numero (total 8 numeros)
			//%20s - Adiciona 20 espacos antes da string
			//%08.2f - Deixa o numero com 8 caracteres, sendo 2 decimais (Ex: 00210,10)
			//%n - Pula linha
			
			linhaScanner.close();
			
			//String[] valores = linha.split(",");
			//System.out.println(valores[3]); Imprime os nomes
			//System.out.println(Arrays.toString(valores));	Imprime cada linha ente []		
		}
		scanner.close();

	}

}
