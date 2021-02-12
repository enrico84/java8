package it.esempi.java8.lambda.sorting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Customer {
    
    private int id;
    private String name;
    private Long salary;
    
    @Override
    public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    
    

}
