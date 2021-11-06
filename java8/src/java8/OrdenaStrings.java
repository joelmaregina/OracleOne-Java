package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		//palavras.sort((s1, s2) -> {
			//if (s1.length() < s2.length()) {
				//return -1;
			//}
			//if (s1.length() > s2.length()) {
				//return 1;
			//}
			//return 0;
		//});
// O código acima, pode (com o uso das Lambdas) se resumir em:
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		//Outro ex mais curto:
		palavras.sort(Comparator.comparing(s -> s.length()));
		//Mais curto ainda:
		palavras.sort(Comparator.comparing(String::length));
		
		

		System.out.println(palavras); // String sem Comparator -> usa Comparable ordena em ordem alfabética[alura
										// online, caelum, casa do código]

		// for (String p : palavras) {
		// System.out.println(p);
		// }
		
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		
		palavras.forEach(System.out::println);

		palavras.forEach(s -> System.out.println(s));
	}
}


