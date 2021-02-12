package it.esempi.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    
    public static void main(String args[]) {
	
	System.out.println("=============== PARALLEL STREAM ================");
	//Lista Mutevole
	List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 7, 8, 9));
	
	Stream<Integer> stream = list.parallelStream();
	
	Integer[] evenNumberArr = stream.filter(s -> s % 2 == 0).toArray(Integer[]:: new);
	System.out.println("Parallel stream di interi pari");
	for(int i = 0; i < evenNumberArr.length; i++) {
	    System.out.println(evenNumberArr[i]);
	}
	
	
	
    }

}
