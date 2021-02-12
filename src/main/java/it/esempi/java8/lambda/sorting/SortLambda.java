package it.esempi.java8.lambda.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLambda {

    public static void main(String[] args) {

	List<Integer> integers = new ArrayList<Integer>();
	integers.add(20);
	integers.add(50);
	integers.add(10);
	integers.add(60);
	integers.add(30);
	integers.add(40);

	// 1. ascending
	Collections.sort(integers);

	System.out.println("Collection.sort --> ordinamento ascendente");
	System.out.println(integers);

	// 2. descending
	Collections.reverse(integers);
	System.out.println("\nCollection.reverse --> ordinamento discendente");
	System.out.println(integers);

	List<Customer> listCustomers = new ArrayList<Customer>();
	listCustomers.add(new Customer(1, "Pippo", new Long(2000)));
	listCustomers.add(new Customer(1, "Pluto", new Long(8000)));
	listCustomers.add(new Customer(1, "Paperino", new Long(5000)));
	listCustomers.add(new Customer(1, "Minni", new Long(6000)));
	listCustomers.add(new Customer(1, "Topolino", new Long(4000)));

	// 3. descending
	Collections.sort(listCustomers, new MySort());
	System.out.println("\nCollection.sort --> ordinamento discendente di Customer tramite il salario");
	System.out.println(listCustomers);

	// 4. Con Anonymus inner class - ascending
	Collections.sort(listCustomers, new Comparator<Customer>() {

	    @Override
	    public int compare(Customer o1, Customer o2) {
		return (int) (o1.getSalary() - o2.getSalary());
	    }

	});
	System.out.println("\nCollection.sort - Anonymous class --> ordinamento ascendente di tramite il salario");
	System.out.println(listCustomers);

	// 5. Con Lambda expression - ascending
	Collections.sort(listCustomers, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
	System.out.println("\nCollection.sort - Lambda Expression --> ordinamento ascendente di tramite il salario");
	System.out.println(listCustomers);

	// 6. Con Lambda expression - ascending tramite il nome
	Collections.sort(listCustomers, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
	System.out.println("\nCollection.sort - Lambda Expression --> ordinamento ascendente di tramite il nome");
	System.out.println(listCustomers);

    }

}

class MySort implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {

	return (int) (o2.getSalary() - o1.getSalary());
    }

}