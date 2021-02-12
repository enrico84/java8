package it.esempi.java8.lambda.sorting;

/* 
 * Questa è un Functional Interface ANCHE SENZA l'annotation @FunctionalInterface
 *
 * Una Functional Interface ha UNO ED UN SOLO metodo astratto
 */
interface Arithmetic {
    abstract int operation(int a, int b);
}

public class ArithmeticLambda {

    public static void main(String[] args) {

	System.out.println("=================  OPERAZIONI ARITMETICHE ==================");

	// 1. Implementazione con Anonymous class
	Arithmetic sum = new Arithmetic() {

	    @Override
	    public int operation(int a, int b) {
		return a + b;
	    }
	};
	long value = sum.operation(30, 10);
	System.out.println("\nArithmetic.sum - Anonymous class: " + value);

	// 2. Con Lambda Expression
	Arithmetic addition = (a, b) -> (a + b);
	System.out.println("\nArithmetic.sum - lambdaExpression: " + addition.operation(30, 10));

	Arithmetic subtract = (a, b) -> (a - b);
	System.out.println("\nArithmetic.subtract - lambdaExpression: " + subtract.operation(30, 10));

	Arithmetic division = (a, b) -> (a / b);
	System.out.println("\nArithmetic.division - lambdaExpression: " + division.operation(30, 10));

	Arithmetic multiply = (a, b) -> (a * b);
	System.out.println("\nArithmetic.multiply - lambdaExpression: " + multiply.operation(30, 10));

    }

}
