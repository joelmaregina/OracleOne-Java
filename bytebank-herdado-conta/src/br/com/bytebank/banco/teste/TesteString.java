package br.com.bytebank.banco.teste;

public class TesteString {
	public static void main(String [] args) {
		String nome = "Alura";
		// A declara��o acima � v�lida e cria um objeto, n�o precisa escrever assim:
		//String outro = new String("Alura")
		
		//Usando as seguintes fun��es, n�o funciona pois a STRING � um objeto que n�o pode ser alterado (Imutabilidade);
		//nome.replace("A", "a");
		//nome.toLowerCase
		//System.out.println(nome)
		//(Se voc� queira alterar algo em uma String, voc� ter� de criar uma String que refletir� uma nova a��o, ou seja, teremos dois objetos, como duas "Aluras", sendo uma com "A" e outra com "a");
		//
		
		System.out.println(nome.length()); //5
		
		for (int i=0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i)); // A l u r a uma em cada linha
		}
		
		//substring
		String sub = nome.substring(1);
		System.out.println(sub); //"lura" - Retorna a partir do index (que come�a em 0)
		
		
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
		char c = 'A'; // Char � apenas 1 caracter, usa aspas simples
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
		System.out.println(outroVazio.isEmpty()); //true - Porque "trim()" retirou todos os espa�os;
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
