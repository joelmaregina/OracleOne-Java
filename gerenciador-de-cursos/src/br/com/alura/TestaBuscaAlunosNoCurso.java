package br.com.alura;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 32));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		Aluno a1 = new Aluno("Rodrigo Turine", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		Aluno a4 = new Aluno("Joelma Regina", 5617); //sobrescreve o aluno com a matricula 5617 anteriormente usado
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes.getAlunos());
		
		System.out.println("Quem é o aluno com matricula 5617");
		Aluno aluno = javaColecoes.buscaMatriculado(5617); //Joelma Regina (Sobrescreve o aluno anterior)
		System.out.println("Aluno: " + aluno);
		
	}
}
