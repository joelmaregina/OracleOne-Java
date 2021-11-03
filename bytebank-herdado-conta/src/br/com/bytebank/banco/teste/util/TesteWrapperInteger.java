package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int idade = 29;
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.doubleValue());

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue(); //unboxing
		String s = args[0];//"10"
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing
		
		//Para cada primitivo existe uma classe chamada Wrapper
		//Pra guardar um primitivo numa coleção é preciso criar um objeto que embrulha o valor
		//A criação do objeto Wrapper é chamada de autoboxing
		//A retirada do valor primitivo do objeto Wrapper é chamada de unboxing
		//Autoboxing e unboxing acontecem automaticamente.
		//As classes wrapper possuem vários métodos auxiliares, por exemplo para o parsing
		//Todas as classes wrappers que representam um valor numérico possuem a classe java.lang.Number como mãe
		
	}

}
