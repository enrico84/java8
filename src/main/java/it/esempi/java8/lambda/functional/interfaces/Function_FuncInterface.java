package it.esempi.java8.lambda.functional.interfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Function_FuncInterface {

    public static void main(String[] args) {

	System.out.println("================= FUNCTIONAL INTERFACE - FUNCTION ==================");

	// esempio 1. Anonymous implementation
	Function<String, Integer> func = new Function<String, Integer>() {

	    @Override
	    public Integer apply(String t) {
		return t.length();
	    }
	};
	System.out.println(func.apply("Enrico Capone"));

	// esempio 2. Lambda implementation
	Function<String, Integer> func2 = (t) -> (t.length());
	System.out.println(func2.apply("\nEnrico Capone"));

	// esempio 3. Lambda implementation
	Function<Integer, String> func3 = (a) -> {
	    if (a % 2 == 0)
		return "Il numero " + a + " è pari.";
	    else
		return "Il numero " + a + " è dispari.";
	};
	System.out.println("\n" + func3.apply(4));

	// esempio 4. lambda with andThen
	System.out.println("\nConcatenzazione di due Function con il metodo andThen()");
	Function<String, Integer> func4 = (s) -> s.length();
	Function<Integer, Integer> func5 = (s) -> s * 2;
	Integer result = func4.andThen(func5).apply("Enrico Capone"); // l'ouptut di func4 lo passo in input a func5
	System.out.println(result);

	// esempio 5. Passare una Function<T, R> come argomento ad una funzione
	System.out.println("\nMappa di linguaggi");
	List<String> languages = Arrays.asList("Java", "C#", "C++", "Python");
	Map<String, Integer> returnMap = convertListToMap(languages, l -> l.length());

	System.out.println(returnMap); // {C#=2, Java=4, C++=3, Python=6}

    }

    private static <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> function) {

	Map<T, R> map = new HashMap<>();
	for (T t : list) {
	    map.put(t, function.apply(t));
	}

	return map;
    }

}
