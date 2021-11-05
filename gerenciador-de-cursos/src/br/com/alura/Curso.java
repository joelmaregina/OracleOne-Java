package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>(); //HashSet não ordena os itens pela ordem de adição, LinkedHashset sim
	//TreeSet<>() funciona apenas para classes que são Comparable OU
	// o construtor do TreeSet recebe como parâmetro um objeto que implementa Comparator
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	//O LinkedHashMap continua nos dando a performance de um HashMap, mas com acesso previsível e ordenado, seguindo a inserção dos seus elementos.

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		// int tempoTotal = 0;
		// for (Aula aula : aulas) {
		// tempoTotal += aula.getTempo();
		// }
		// return tempoTotal;
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", " + "aulas: " + this.aulas + " ]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException();
		}
		return matriculaParaAluno.get(numero); //Faz a pesquisa ser mais rápida pois ele procura no local certo, não faz iterações de todos/varios elementos
		
		//Código desnecessário ao usar o Map:
		//for (Aluno aluno : alunos) {
			//if(aluno.getNumeroMatricula() == numero);
			//return aluno;
		//}
		//throw new NoSuchElementException("Aluno não encontrado!" + numero);
		
	}

	
}
