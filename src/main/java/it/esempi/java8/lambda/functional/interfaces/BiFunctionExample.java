package it.esempi.java8.lambda.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {

    public static void main(String[] args) {

	System.out.println("================= FUNCTIONAL INTERFACE BIFUNCTION ==================");
	System.out.println(
		"================= RICEVE TRE ARGOMENTI(input, input, output) E CALCOLA L'OUTPUT FINALE ==================");

	// esempio 1
	BiFunction<Person, Person, Integer> biFunction = (p1, p2) -> {
	    return p1.getAge() + p2.getAge();
	};

	List<Person> coppia = Arrays.asList(new Person("Maurizio", 40), new Person("Giusy", 32));
	System.out.println();
	coppia.forEach((person) -> System.out.println("Nome: " + person.getName() + ", età: " + person.getAge()));

	int age = biFunction.apply(coppia.get(0), coppia.get(1));
	System.out.println("\nGiusy e Maurizio hanno complessivamente " + age + " anni.");

	// esempio 2. Operazioni aritmetiche
	System.out.println("\nOperazioni aritmetiche");
	BiFunction<Integer, Integer, Integer> addition = (x, y) -> x + y;
	System.out.println("30 + 3 = " + addition.apply(30, 3));

	BiFunction<Integer, Integer, Integer> difference = (x, y) -> x - y;
	System.out.println("30 - 3 = " + difference.apply(30, 3));

	BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
	System.out.println("30 * 3 = " + multiply.apply(30, 3));

	BiFunction<Integer, Integer, Integer> division = (x, y) -> x / y;
	System.out.println("30 / 3 = " + division.apply(30, 3));

	// esempio 3. biFunction.andThen(function)
	Function<Integer, Integer> function = a -> (a * a);
	Integer result = addition.andThen(function).apply(5, 2);
	System.out.println("\nbiFunction.andThen(function).apply(5,2): " + result);

    }

}
