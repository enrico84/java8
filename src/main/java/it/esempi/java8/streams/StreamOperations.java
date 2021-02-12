package it.esempi.java8.streams;

import java.nio.channels.MembershipKey;
import java.util.ArrayList;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {
	
	List<String> memberNames = new ArrayList<>();
	memberNames.add("Amitabh");
	memberNames.add("Shekhar");
	memberNames.add("Aman");
	memberNames.add("Rahul");
	memberNames.add("Shahrukh");
	memberNames.add("Salman");
	memberNames.add("Yana");
	memberNames.add("Lokesh");
	
	System.out.println("******** OPERAZIONI INTERMEDIE: Ritornano uno stream di elementi a cui si possono applicare varie operazioni intermedie ********");
	System.out.println("Lista Completa:");
	memberNames.forEach(System.out::println);
	
	System.out.println("\nSTREAM: solo le parole che iniziano con la lettera A");
	memberNames.stream().filter(m -> m.startsWith("A")).forEach(System.out::println);
	
	
	System.out.println("\nSTREAM: solo le parole che iniziano con la lettera S e convertite in Maiuscolo");
	memberNames.stream().filter(m -> m.startsWith("S")).map(String::toUpperCase).forEach(System.out::println);
	
	
	System.out.println("\nSTREAM: tutte le parole convertite in Maiuscolo e ordinate");
	memberNames.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
	
	System.out.println();
	System.out.println("******** OPERAZIONI TERMINALI: Ritornano un risultato di un certo tipo ********");
	
	
	boolean anyMatchResult = memberNames.stream().anyMatch(s -> s.startsWith("L"));
	System.out.println("AnyMatch: " +anyMatchResult);
	
	boolean allMatchResult = memberNames.stream().allMatch(s -> s.startsWith("S"));
	System.out.println("AllMatch: " +allMatchResult);
	
	boolean noneMatchResult = memberNames.stream().noneMatch(s -> s.startsWith("A"));
	System.out.println("NoneMatch: " +noneMatchResult);
	
	long count = memberNames.stream().filter(i -> i.startsWith("S")).count();
	System.out.println("\nNomi della lista che iniziano con S: " +count);
		

    }

}
