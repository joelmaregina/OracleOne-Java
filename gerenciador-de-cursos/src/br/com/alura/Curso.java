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
	private Set<Aluno> alunos = new HashSet<>(); //HashSet n�o ordena os itens pela ordem de adi��o, LinkedHashset sim
	//TreeSet<>() funciona apenas para classes que s�o Comparable OU
	// o construtor do TreeSet recebe como par�metro um objeto que implementa Comparator
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	//O LinkedHashMap continua nos dando a performance de um HashMap, mas com acesso previs�vel e ordenado, seguindo a inser��o dos seus elementos.

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
		return matriculaParaAluno.get(numero); //Faz a pesquisa ser mais r�pida pois ele procura no local certo, n�o faz itera��es de todos/varios elementos
		
		//C�digo desnecess�rio ao usar o Map:
		//for (Aluno aluno : alunos) {
			//if(aluno.getNumeroMatricula() == numero);
			//return aluno;
		//}
		//throw new NoSuchElementException("Aluno n�o encontrado!" + numero);
		
	}

	
}
