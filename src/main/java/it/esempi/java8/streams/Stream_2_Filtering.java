package it.esempi.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Stream_2_Filtering {

    public static void main(String[] args) {

	System.out.println("================= FILTRARE UNO STREAM DI OBJECTS ==================");
	List<Product> list = new ArrayList<Product>();

	// Filtro usando java standard
	for (Product p : getProductList()) {
	    if (p.getPrice() >= 600f)
		list.add(p);
	}

	System.out.println("\nLista completa:");
	for (Product p : getProductList()) {
	    System.out.println(p);
	}

	System.out.println("\nLista filtrata usando java standard:");
	for (Product p : list) {
	    if (p.getPrice() >= 600)
		System.out.println(p);
	}

	// Filtro usando stream API
	System.out.println("\nLista filtrata usando stream API");
	getProductList().stream().filter((product) -> product.getPrice() >= 600f).forEach(System.out::println);

    }

    private static List<Product> getProductList() {

	List<Product> productList = null;

	Product p1 = new Product(1, "Asus", 600f);
	Product p2 = new Product(2, "Hp", 650f);
	Product p3 = new Product(3, "Dell", 500f);
	Product p4 = new Product(4, "Toshiba", 550f);
	Product p5 = new Product(5, "Samsung", 700f);
	productList = Arrays.asList(p1, p2, p3, p4, p5);

	return productList;
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
