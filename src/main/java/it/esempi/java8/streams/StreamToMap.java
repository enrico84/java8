package it.esempi.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamToMap {
    
    public static void main(String[] args) {
	
	System.out.println("=============== STREAM MAP ================");
	
	List<Employee> listEmployes = new ArrayList<>(Arrays.asList(
		new Employee(1, "A", "5000"),
		new Employee(2, "B", "5300"),
		new Employee(3, "C", "400"),
		new Employee(4, "D", "2000"),
		new Employee(5, "E", "2200"),
		new Employee(6, "F", "15000")
		));
	
	Map<Integer, Employee> employeesMap = listEmployes.stream()
						.collect(Collectors.toMap(Employee::getId, Function.identity()));
	
	System.out.println("Mappa di oggetti Employee: " +employeesMap);
	
	System.out.println("\nSTREAM MAP: Conversione di una Lista con valori dublicati, raggruppandoli per nome:");
	
	List<Employee> dulicateEmployees = new ArrayList<>(Arrays.asList(
		new Employee(1, "A", "5000"),
		new Employee(2, "A", "5300"),
		new Employee(3, "A", "400"),
		new Employee(4, "B", "2000"),
		new Employee(5, "C", "2200"),
		new Employee(6, "C", "15000")
		));
	
	Map<String, List<Employee>> finalEmployeMap = dulicateEmployees.stream()
							.collect(Collectors.groupingBy(Employee::getName));
	
	System.out.println(finalEmployeMap);
	
    }

}
