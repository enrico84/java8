package it.esempi.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream_5_FindEelement {

    public static void main(String[] args) {
	System.out.println("================= OPERAZIONE DI FIND COUNT, MIN E MAX CON GLI STREAM ==================");

	List<Integer> list = Arrays.asList(1, 2, 3, 1, 2, 4);
	Optional<Integer> element = list.stream().findFirst();
	if (element.isPresent())
	    System.out.println(element.get());
	else
	    System.out.println("Stream in empty");

	Optional<Integer> element1 = list.stream().findAny();
	if (element1.isPresent())
	    System.out.println(element1.get());
	else
	    System.out.println("Stream in empty");

	System.out.println("*******************************");

	Stream<Integer> listElements = Stream.of(1, 33, 4, 65, 12, 8);
	System.out.println("Stream.count => " + listElements.count());

	Integer min = Stream.of(1, 33, 4, 65, 12, 8).min(Comparator.comparing(Integer::valueOf)).orElse(null);
	System.out.println("Stream.min => " + min);

	Integer max = Stream.of(1, 33, 4, 65, 12, 8).max(Comparator.comparing(Integer::valueOf)).orElse(null);
	System.out.println("Stream.max => " + max);

    }

}
