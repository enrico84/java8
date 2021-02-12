package it.esempi.java8.lambda;

interface Writewable {
    void write(String message);
}

interface AddNumber {
    int add(int a, int b);
}

public class LambdaWithParameters {
    
    public static void main(String[] args) {
	
	// Anonymus class
	Writewable writeble = new Writewable() {
	    
	    @Override
	    public void write(String message) {
		System.out.println(message);
	    }
	};
	writeble.write("Anonymous class --> write");
	
	// Usando lamba expression
	Writewable lambdaWriteble = (message) -> System.out.println(message);
	lambdaWriteble.write("\nLambda --> Draw...");
	
	// Usando lamba expression solo con 1 istruzione
	AddNumber lambdaAdd = (a,b) -> (a+b);
	System.out.println("\nLambda somma --> " +lambdaAdd.add(10, 20));
	
	// Usando lamba expression con più istruzioni
	AddNumber lambdaAdd_1 = (a, b) -> {
	    System.out.println(a);
	    System.out.println(b);
	    return (a+b);
	};
	System.out.println("\nLambda somma --> " +lambdaAdd_1.add(10, 20));
	
	
    }

}
