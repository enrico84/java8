package it.esempi.java8.lambda.functional.interfaces;

interface PariDispari {
    void verifica(int a);
}

public class Lambda_2_FuncInterface {

    public static void main(String[] args) {

	System.out.println("================= FUNCTIONAL INTERFACE ==================");

	// Implementazione con Anonymous inner class
	//
	PariDispari pariDispari = new PariDispari() {

	    @Override
	    public void verifica(int a) {
		if (a % 2 == 0)
		    System.out.println("\nIl numero " + a + " è pari");
		else
		    System.out.println("\nIl numero " + a + " è dispari");
	    }
	};

	pariDispari.verifica(12);

	// Implementazione con lambda expression
	//
	PariDispari pariDispari2 = (a) -> {
	    if (a % 2 == 0)
		System.out.println("\nIl numero " + a + " è pari");
	    else
		System.out.println("\nIl numero " + a + " è dispari");
	};
	pariDispari2.verifica(31);

    }
}
