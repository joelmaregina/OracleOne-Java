package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		//int sum = cursos.stream().filter(c -> c.getAlunos() >=100).map(c -> c.getAlunos()).forEach(total -> System.out.println(total)).sum();		
		//System.out.println(sum);		
		//.forEach(c -> System.out.println(c.getNome())) //Imprime os cursos com mais de 100 inscritos
		 //ou Curso::getAlunos
		// Ou System.out::println
		
		Optional<Curso> optionalCurso = cursos.stream().filter(c -> c.getAlunos() >=100).findAny();		
		Curso curso = optionalCurso.orElse(null);
		System.out.println(curso.getNome()); //Java 8		
		optionalCurso.ifPresent(c -> System.out.println(c.getNome())); // Caso não ache algum curso com >= 100 nãi imprime nada, ao invés da excessão NullPointerException:
		//*******outra melhor forma de fazer o código acima:******

		cursos.stream().filter(c -> c.getAlunos() >=100).findAny().ifPresent(c -> System.out.println(c.getNome()));
		

		//Calcula a quantidade média de alunos de todos os seus cursos utilizando a API de Stream:
		cursos.stream()
	    .mapToInt(c -> c.getAlunos())
	    .average();
		
		List<Curso> cursosFiltrados = cursos.stream()
				   .filter(c -> c.getAlunos() > 50)
				   .collect(Collectors.toList());
		
		System.out.println(cursosFiltrados);
		
	}
}
