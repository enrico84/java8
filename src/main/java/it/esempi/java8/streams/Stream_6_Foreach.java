package it.esempi.java8.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import it.esempi.java8.lambda.sorting.Customer;

public class Stream_6_Foreach {

    public static void main(String[] args) {

	System.out.println("================= CICLO FOREACH CON STREAM ==================");

	List<Customer> list = new ArrayList<>();
	list.add(new Customer(1, "Pippo", new Long(2000)));
	list.add(new Customer(2, "Pluto", new Long(8000)));
	list.add(new Customer(3, "Paperino", new Long(5000)));
	list.add(new Customer(4, "Minni", new Long(6000)));
	list.add(new Customer(5, "Topolino", new Long(4000)));

	// 1. foreach di una lista
	list.forEach(c -> {
	    System.out.println(c.getName() + " - " + c.getSalary());
	});

	System.out.println("------------");

	list.stream().forEach(c -> {
	    System.out.println(c.getName() + " - " + c.getSalary());
	});

	System.out.println("********************************");

	// 2. foreach di un set
	Set<Customer> set = new HashSet<>(list);

	set.forEach(c -> {
	    System.out.println(c.getName() + " - " + c.getSalary());
	});

	System.out.println("------------");

	set.stream().forEach(c -> {
	    System.out.println(c.getName() + " - " + c.getSalary());
	});

	System.out.println("********************************");

	// 3. foreach di una map
	Map<Integer, Customer> map = new HashMap<>();

	map = list.stream().collect(Collectors.toMap(Customer::getId, Function.identity()));

	for (Entry<Integer, Customer> entry : map.entrySet()) {
	    System.out.println(
		    entry.getKey() + " - " + entry.getValue().getName() + " - " + entry.getValue().getSalary());

	}

	System.out.println("------------");

	map.forEach((k, v) -> {
	    System.out.println(k + " - " + v.getName() + " - " + v.getSalary());
	});

    }

}
