package it.esempi.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InternalIteration {

    public static void main(String[] args) {

	System.out.println("EXTERNAL ITERATOR");
	List<String> vocali = Arrays.asList(new String[]{"a", "e", "i", "o", "u"});
	System.out.println("Prima iterazione con un ciclo for:");
	for (String v : vocali) {
	    System.out.println(v.toUpperCase());
	}
	
	System.out.println("\nSeconda iterazione con un Iterator:");
	List<String> alfabeto = Arrays.asList("a", "b", "c", "d", "e");
	Iterator<String> it = alfabeto.iterator();
	while(it.hasNext()) {
	    System.out.println(it.next().toUpperCase());
	}
	
	System.out.println("\nINTERNAL ITERATOR");
	System.out.println("Terza iterazione con una lamba expression:");
	List<String> lettere = Arrays.asList(new String[]{"f", "g", "h", "i", "y"});
	lettere.forEach(l -> System.out.println(l.toUpperCase()));
	
	System.out.println("\nQuarta iterazione con una lamba expression:");
	List<Integer> numeri = Arrays.asList(2, 3, 4, 5, 6);
	numeri.forEach(n -> System.out.println(n*n));

    }

}
