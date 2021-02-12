package it.esempi.java8.lambda.privates.interfaces;

public class CalculatorImpl implements Calculator {

    public static void main(String[] args) {

	System.out.println("================= USO DI INTERFACE CON METODI DEFAULT E PRIVATE ==================");

	Calculator calculator = new CalculatorImpl();
	int sommaPari = calculator.addNumeriPari(1, 2, 3, 4, 5, 6, 7, 8, 9);
	System.out.println(sommaPari);

	int sommaDispari = calculator.addNumeriDispari(1, 2, 3, 4, 5, 6, 7, 8, 9);
	System.out.println(sommaDispari);

    }

}
