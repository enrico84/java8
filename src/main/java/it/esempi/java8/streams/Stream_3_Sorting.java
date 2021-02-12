package it.esempi.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import it.esempi.java8.lambda.sorting.Customer;

public class Stream_3_Sorting {

    public static void main(String[] args) {

	System.out.println("================= SORTING USANDO STREAM DA OBJECTS ==================");

	List<String> fruits = new LinkedList<>();
	fruits.add("Mela");
	fruits.add("Banana");
	fruits.add("Fragola");
	fruits.add("Ciliegia");
	fruits.add("Anguria");

	// ascending order(default)
	System.out.println("\nOrdine ascendente alfabetico (default):");
	List<String> sortedList = fruits.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedList);

	List<String> sortedList2 = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	System.out.println(sortedList2);

	List<String> sortedList3 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
	System.out.println(sortedList3);

	// descending order
	System.out.println("\nOrdine discendente alfabetico:");
	List<String> sortedList4 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(sortedList4);

	List<String> sortedList5 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
	System.out.println(sortedList5);

	System.out.println();
	System.out.println("****************************************");

	List<Customer> listCustomers = new ArrayList<>(Arrays.asList(new Customer(1, "Adam", 5000l),
		new Customer(2, "Ben", 5300l), new Customer(3, "Carl", 400l), new Customer(4, "Diego", 2000l),
		new Customer(5, "Eric", 2200l), new Customer(6, "Francis", 15000l)));

	System.out.println("\nOrdine discendente per salario:");
	// 1. descending sorted with Anonymous inner class
	List<Customer> sortedCustomers = listCustomers.stream().sorted(new Comparator<Customer>() {

	    @Override
	    public int compare(Customer c1, Customer c2) {
		return (int) (c2.getSalary() - c1.getSalary());
	    }
	}).collect(Collectors.toList());

	System.out.println(sortedCustomers);

	// 2. descending sorted with lambda expression
	List<Customer> sortedCustomers2 = listCustomers.stream()
		.sorted((c1, c2) -> (int) (c2.getSalary() - c1.getSalary())).collect(Collectors.toList());
	System.out.println(sortedCustomers2);

	// 3. descending sorted with Comparator.comparingLong
	List<Customer> sortedCustomers3 = listCustomers.stream()
		.sorted(Comparator.comparingLong(Customer::getSalary).reversed()).collect(Collectors.toList());
	System.out.println(sortedCustomers3);

	System.out.println("\nOrdine ascendente e discendente per nome:");

	// 4. ascending sorted
	List<Customer> sortedCustomers4 = listCustomers.stream().sorted(Comparator.comparing(Customer::getName))
		.collect(Collectors.toList());
	System.out.println(sortedCustomers4);

	// 5. descending sorted
	List<Customer> sortedCustomers5 = listCustomers.stream()
		.sorted(Comparator.comparing(Customer::getName).reversed()).collect(Collectors.toList());
	System.out.println(sortedCustomers5);
    }

}
