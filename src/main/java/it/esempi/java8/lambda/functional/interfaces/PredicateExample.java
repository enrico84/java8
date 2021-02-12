package it.esempi.java8.lambda.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class PredicateExample {

    public static void main(String[] args) {

	System.out.println("================= FUNCTIONAL INTERFACE PREDICATE ==================");

	// esempio 1. Lambda Expression
	Predicate<Person> predicate = (person) -> (person.getAge() > 30);
	boolean value = predicate.test(new Person("Enrico", 36));
	System.out.println("\nFunctional Interface Predicate --> test: " + value);

	// esempio 2. Usare più Predicate con and()
	System.out.println("\nFunctional Interface Predicate with Stream - filter with and():");

	Predicate<Integer> predicate2 = (x) -> x > 4;
	Predicate<Integer> predicate3 = (x) -> x < 8;
	List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 10);
	integerList.stream().filter(predicate2.and(predicate3)).forEach(System.out::println);

	// esempio 3. Usare più Predicate con or()
	System.out.println("\nFunctional Interface Predicate with Stream - filter with or():");

	Predicate<String> predicate4 = (x) -> x.length() == 3;
	Predicate<String> predicate5 = (x) -> x.startsWith("C");
	List<String> list = Arrays.asList("C", "ABC", "AAA", "BB", "AB", "ABC", "CACB");
	list.stream().filter(predicate4.or(predicate5)).forEach(System.out::println);

    }
}

@Getter
@Setter
@AllArgsConstructor
class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
    }

}
