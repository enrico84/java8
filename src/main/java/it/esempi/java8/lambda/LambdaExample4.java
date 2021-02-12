package it.esempi.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaExample4 {
    
    public static void main(String[] args) {
	
	// 1. foreach
	List<String> list= Arrays.asList("A", "B", "C", "D");
	list.forEach(element -> System.out.println(element));
	
	System.out.println("");
	
	// 2. foreach + Consumer
	Consumer<String> printString = System.out::println;
	list.forEach(element -> printString.accept(element));
	
	System.out.println("");
	
	// 3. foreach + Consumer + Stream
	Stream<String> streamString = list.stream();
	streamString.forEach(printString);
	
    }

}
