package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
        alunos.add("Joelma Almeida");
        alunos.add("Roque Silva");
        alunos.add("Ci�ran Murphy");
        alunos.add("Sergio Lopes");
        alunos.add("Priscila Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Ci�ran Murphy");
        
        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        alunos.remove("Sergio Lopes");
        System.out.println(pauloEstaMatriculado);//false

        System.out.println(alunos);
        
        for (String aluno : alunos) {
			System.out.println(aluno);
		}
        System.out.println("\n");
        //ou
        alunos.forEach(aluno -> {
        	System.out.println(aluno);
        });
        
        //Retorna: [Ci�ran Murphy, Joelma Almeida, Sergio Lopes, Mauricio Aniche, Roque Silva, Priscila Saggio]
        //SET -Os alunos n�o s�o impressos na ordem em que foram adicionados, pois n�o h� uma ordem no SET
        
        //Set | Vantagem: N�o permite adicionar elementos repetidos:        
        System.out.println(alunos.size()); //Imprime "6", mesmo tendo 7 (1 repetido)
        
        
        //Caso seja necess�rio ordenar ou escolher pelo index, apenas criando uma Collection(interface) do tipo List (O m�todo Collections.sort (da classe java.util.Collections) s� funciona com listas):
        List<String> alunosEmLista = new ArrayList<>(alunos);
        

	}
}
