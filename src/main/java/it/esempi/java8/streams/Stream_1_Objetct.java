package it.esempi.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Stream_1_Objetct {
    
    public static void main(String[] args) {
	
	System.out.println("================= CREAZIONE DI STREAM DA OBJECTS ==================");
	
	// 1. creare uno stream 
	Stream<String> stream = Stream.of("a", "b", "c");
	stream.forEach(System.out::println);
	
	// 2. creare uno stream da una sorgente
	Collection<String> collection = Arrays.asList("Paperino", "Pluto", "Pippo", "Topolino");
	Stream<String> stream2 = collection.stream();
	stream2.forEach(System.out::println);
	
	
	List<String> list = Arrays.asList("Paperino", "Pluto", "Pippo", "Topolino");
	Stream<String> stream3 = list.stream();
	stream3.forEach(System.out::println);
	
	
	Set<String> set = new HashSet<String>(list);
	Stream<String> stream4 = set.stream();
	stream4.forEach(System.out::println);
	
	
	String[] arr = new String[] {"Java", "J2EE", "Spring", "Struts"};
	Stream<String> stream5 = Arrays.stream(arr);
	stream5.forEach(System.out::println);
	
	
    }

}
