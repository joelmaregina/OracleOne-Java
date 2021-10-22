package br.com.bytebank.banco.teste;

public class TesteString {
	public static void main(String [] args) {
		String nome = "Alura";
		// A declaração acima é válida e cria um objeto, não precisa escrever assim:
		//String outro = new String("Alura")
		
		//Usando as seguintes funções, não funciona pois a STRING é um objeto que não pode ser alterado (Imutabilidade);
		//nome.replace("A", "a");
		//nome.toLowerCase
		//System.out.println(nome)
		//(Se você queira alterar algo em uma String, você terá de criar uma String que refletirá uma nova ação, ou seja, teremos dois objetos, como duas "Aluras", sendo uma com "A" e outra com "a");
		//
		
		System.out.println(nome.length()); //5
		
		for (int i=0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i)); // A l u r a uma em cada linha
		}
		
		//substring
		String sub = nome.substring(1);
		System.out.println(sub); //"lura" - Retorna a partir do index (que começa em 0)
		
		
		//charAt - Retorna a letra/caractere do index indicado 
		char h = nome.charAt(2);
		System.out.println(h); //u - Retorna o index escolhido
		
		//indexOf - Retorna o index do caractere/string escolhida
		int pos = nome.indexOf("ur");
		System.out.println(pos); //2
		
		//replace, toLowerCase, toUpperCase
		String outra = nome.replace("A", "a");
		String nova = nome.toLowerCase();
		String grande = nome.toUpperCase();
		System.out.println(nome); //Alura
		System.out.println(outra); //alura
		System.out.println(nova); //alura
		System.out.println(grande); //ALURA
		
		//replace
		char c = 'A'; // Char é apenas 1 caracter, usa aspas simples
		char d = 'a';
		String outro = nome.replace(c, d);
		
		// isEmpty X isBlank
		String vazio = "";
		System.out.println(vazio.isEmpty()); //true
		System.out.println(vazio.isBlank()); //true
		String espaco = " ";
		System.out.println(espaco.isEmpty()); //false
		System.out.println(espaco.isBlank()); //true
		
		//trim & contains
		String vazio2 = " ";
		String outroVazio = vazio2.trim();
		System.out.println(outroVazio.isEmpty()); //true - Porque "trim()" retirou todos os espaços;
		//Exemplo:
		String novaAlura = "    Alura    ";
		String novaAluraComTrim = novaAlura.trim();
		System.out.println(novaAlura); //"    Alura    "
		System.out.println(novaAluraComTrim); //Alura
		
		System.out.println(novaAluraComTrim.contains("Alu"));//true
		
		
		String nomee = "ALURA";
		CharSequence cs = new StringBuilder("al");	
		nomee = nomee.replace("AL", cs);	
		System.out.println(nomee); //alURA
	}
	
	

}
