package it.esempi.java8.lambda.functional.interfaces;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class SupplierExample {

    public static void main(String[] args) {

	System.out.println("================= FUNCTIONAL INTERFACE SUPPLIER ==================");

	// esempio 1 - Lambda expression
	Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
	System.out.println("\n" + supplier.get());

	// esempio 2 - Lambda expression
	Supplier<Person> supplier1 = () -> new Person("Enrico", 36);
	Person person = supplier1.get();
	System.out.println("\n" + person.toString());

	// esempio 3 - Lista di Products
	System.out.println("\nLista di Product:");
	System.out.println(getListProduct().get());

    }

    private static Supplier<List<Product>> getListProduct() {

	Supplier<List<Product>> list = () -> {
	    Product p1 = new Product(1, "Asus", 600f);
	    Product p2 = new Product(2, "Hp", 650f);
	    Product p3 = new Product(3, "Dell", 500f);
	    Product p4 = new Product(4, "Toshiba", 550f);
	    Product p5 = new Product(5, "Samsung", 700f);
	    return Arrays.asList(p1, p2, p3, p4, p5);
	};

	return list;
    }

}

@AllArgsConstructor
@Getter
@Setter
class Product {

    private int id;
    private String name;
    private float price;

    @Override
    public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

}
