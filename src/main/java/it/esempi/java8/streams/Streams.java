package it.esempi.java8.streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
import java.util.Random;


public class Streams {
    
    public static void main(String args[]) {
	
	Consumer<Integer> printInteger = System.out::println; 
	System.out.println("STREAM: Stampo dei numeri");
	Stream<Integer> numeri = Stream.of(1,2,3,4,5,6,7,8,9,10);
	numeri.forEach(printInteger);
	
	System.out.println("\nSTREAM: Stampo un array di numeri");
	Stream<Integer> numeri2 = Stream.of(new Integer[]{11,22,33,44,55,66,77,88,99,100});
	numeri2.forEach(printInteger);
	
	Consumer<String> printString = System.out::println;
	System.out.println("\nSTREAM: Stampo uno stream di stringhe");
	List<String> lista = Arrays.asList("a", "b", "c", "d", "e", "f");
	
	Stream<String> letterStream = lista.stream();
	letterStream.forEach(printString);
	
	System.out.println("*********************************************************************");
	
	System.out.println("\nSTREAM: Stampo uno stream di 10 numeri generati con Random");
	Stream<Integer> random = Stream.generate(() -> (new Random()).nextInt());
	random.limit(10).forEach(System.out::println);
	
	System.out.println("\nSTREAM: Stampo uno Stream di interi data una stringa");
	String stringa = "abcd_12345&%$";
	IntStream stream = stringa.chars();
	stream.forEachOrdered(System.out::println);
	
	System.out.println("\nSTREAM: Stampo uno Stream di stringhe splittate dal carattere $");
	Stream<String> streamss = Stream.of("A$B$C".split("\\$"));
	streamss.forEach(System.out::println);
	
	System.out.println("*********************************************************************");
	
	System.out.println("\nSTREAM: Importare uno Stream di numeri in una Lista di numeri dispari con Collect");
	List<Integer> listaNumeri = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	Stream<Integer> streamDispari = listaNumeri.stream().filter(i -> (i % 2 != 0));
	List<Integer> numeriDispari = streamDispari.collect(Collectors.toList());
	numeriDispari.forEach(System.out::println);
	
	System.out.println("\nSTREAM: Importare uno stream di numeri in un array con solo numeri pari:");
	Stream<Integer> streamPari= listaNumeri.stream().filter(i -> (i % 2 == 0));
	Integer[] arrayPari = streamPari.toArray(Integer[]::new);	
	for(Integer i: arrayPari) {
	    System.out.println(i);
	}
	
	
	
	
	
	
	
    }

}
