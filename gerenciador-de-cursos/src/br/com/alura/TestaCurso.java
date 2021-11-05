package br.com.alura;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java",
                "Paulo Silveira");
		
		//List<Aula> aulas = javaColecoes.getAulas();
		//Ao inv�s de declarar como acima, melhor escrever assim:    
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		//ap�s implementar o m�todo adiciona:
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 32));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 32));
    
    //System.out.println(aulas);
    System.out.println(javaColecoes.getAulas());
    //System.out.println(aulas == javaColecoes.getAulas());
    
    
	} 
}
