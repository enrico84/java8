package it.esempi.java8.lambda.functional.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import it.esempi.java8.lambda.sorting.Customer;

public class ConsumerExample {

    public static void main(String[] args) {

	System.out.println("================= FUNCTIONAL INTERFACE CONSUMER ==================");

	List<Person> people = new ArrayList<>(
		Arrays.asList(new Person("Pippo", 23), new Person("Aldo", 49), new Person("Gio", 26)));

	people.forEach((person) -> System.out.println(person.getName()));

	System.out.println();

	// Creazione di un oggetto Consumer<Person> di cui sarà stampato nome ed età
	Consumer<Person> consumer = ((person) -> {
	    System.out.println("Nome: " + person.getName());
	    System.out.println("Età: " + person.getAge());
	});

	// Instanzio il Consumer<Person>
	consumer.accept(new Person("Giacomo", 50));

	// esempio 2 - Consumer di una List<Person>
	System.out.println();
	Consumer<List<Person>> consumer2 = ((persons) -> {
	    people.forEach(p -> {
		System.out.println("Nome: " + p.getName());
		System.out.println("Età: " + p.getAge());
	    });
	});

	consumer2.accept(people);

	// esempio 3. Concatenare istruzioni Consumer<T>
	System.out.println("\nConcatenare istruzioni Consumer<T>:");
	Consumer<Person> consumer3 = (person) -> System.out.println(person.getName());
	Consumer<Person> consumer4 = (person) -> System.out.println(person.getAge());
	consumer3.andThen(consumer4).accept(new Person("Enrico", 36));

	// esempio 4. Passare un generico Consumer<T> come paramenbtro di un metodo
	System.out.println("\nPassare un generico Consumer<T> come paramenbtro di un metodo:");
	Customer c1 = new Customer(1, "Pippo", 1000l);
	Customer c2 = new Customer(2, "Pluto", 1100l);
	Customer c3 = new Customer(3, "Paperino", 1500l);
	Customer c4 = new Customer(4, "Paperone", 2000l);
	List<Customer> list = Arrays.asList(c1, c2, c3, c4);
	foreach(list, (t) -> System.out.println(t.getName()));
    }

    private static <T> void foreach(List<T> list, Consumer<T> consumer) {

	for (T t : list) {
	    consumer.accept(t);
	}
    }

}
