package it.esempi.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class JavaForEach {

    public static void main(String args[]) {

	List<String> nomi = Arrays.asList("piero", "giovanni", "mauro");
	nomi.forEach(System.out::println);

	/*
	 * The forEach() method performs the given action for each element of the
	 * Iterable until all elements have been processed or the action throws an
	 * exception.
	 */
	Consumer<String> myUpperCase = new Consumer<String>() {

	    @Override
	    public void accept(String t) {
		System.out.println(t.toUpperCase());
	    }
	};

	System.out.println("\nCreo un consumer personalizzato in cui converto le stringhe stampate in Maiuscolo");
	nomi.forEach(myUpperCase);

	System.out.println(
		"\n********************************************************************************************");

	System.out.println("\nMappa classica");
	Map<String, String> myMap = new HashMap<String, String>();
	myMap.put("A", "Alex");
	myMap.put("B", "Bryan");
	myMap.put("C", "Chris");
	myMap.put("E", "Eric");
	myMap.forEach((k, v) -> System.out.println("Chiave = " + k + ", valore = " + v));

	System.out.println("\nCreo un BiConsumer personalizzato in cui converto i valori in Maiuscolo");
	BiConsumer<String, String> action = (a, b) -> {
	    System.out.println("Chiave = " + a + ", valore = " + b.toUpperCase());
	};

	myMap.forEach(action);

	System.out.println(
		"\n********************************************************************************************");

	System.out.println("Uso degli stream con forEach: numeri pari");
	List<Integer> numeri = Arrays.asList(1, 2, 3, 4, 5, 6);
	Consumer<Integer> myAction = System.out::println;

	numeri.stream().filter(n -> n % 2 == 0).forEach(myAction);

	System.out.println("\nUso degli stream con parallel() e forEachOrdered: numeri dispari");
	/*
	 * Durante l'utilizzo di flussi paralleli, utilizzare forEachOrdered () se
	 * l'ordine degli elementi è importante durante l'iterazione. Il metodo forEach
	 * () non garantisce l'ordinamento degli elementi per fornire i vantaggi del
	 * parallelismo.
	 */
	List<Integer> numeri2 = Arrays.asList(7, 8, 9, 10, 11, 12);
	numeri2.stream().filter(n -> n % 2 != 0).parallel().forEachOrdered(myAction);
    }

}
