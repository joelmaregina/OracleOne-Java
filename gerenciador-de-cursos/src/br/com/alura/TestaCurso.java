package br.com.alura;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");
		
		//List<Aula> aulas = javaColecoes.getAulas();
		//Ao invés de declarar como acima, melhor escrever assim:    
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		//após implementar o método adiciona:
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 32));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 32));
    
    //System.out.println(aulas);
    System.out.println(javaColecoes.getAulas());
    //System.out.println(aulas == javaColecoes.getAulas());
    
    
	} 
}
