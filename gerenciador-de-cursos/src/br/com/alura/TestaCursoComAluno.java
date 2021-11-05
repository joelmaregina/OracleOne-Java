package br.com.alura;

import java.util.Set;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 32));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        
        Aluno a1 = new Aluno("Rodrigo Turine", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        System.out.println("Todos os alunos matriculados: ");
        Set<Aluno> alunos = javaColecoes.getAlunos();
        
        //MÉTODO LEGADO, DE ANTES DO FOR (Java 5):
        //Iterator<Aluno> iterador = alunos.iterator();
        //while(iterador.hasNext()) {
        	//Aluno proximo = iterador.next();
        	//System.out.println(proximo);
        //}
        //Vector<Aluno> vetor = new Vector<>(); -> LEGADO
        
        //A partir do Java 8, Antes do Java 8 se usava For "comum"
        javaColecoes.getAlunos().forEach(a -> {
        	System.out.println(a);
        });
        
        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1)); //true
        
        Aluno turine = new Aluno("Rodrigo Turine", 34672);
        System.out.println("E esse Turine, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turine));//false depois de Overwrite o método hashCode na classe Aluno, se torna TRUE
                
        System.out.println("O a1 é == ao Turine?");
        System.out.println(a1 == turine);//false
        
        System.out.println(a1.equals(turine));//false, depois de Overwrite o método equals na classe Aluno, se torna TRUE
        
        System.out.println(a1.hashCode() == turine.hashCode());//true
        
        
	}
}
