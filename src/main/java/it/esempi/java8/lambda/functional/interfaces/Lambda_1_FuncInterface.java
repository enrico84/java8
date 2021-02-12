package it.esempi.java8.lambda.functional.interfaces;

@FunctionalInterface
interface Printable {
    void print(String message);
}

public class Lambda_1_FuncInterface {
    
    public static void main(String[] args) {
	
	/*
	 *   ===== FUNCTIONAL INTERFACE ====
	 *
	 *  - Interface con UNO ED UN SOLO metodo astratto
	 *  - Può avere un numero illimitato di metodi annotati con "default" o "static"
	 *  - Può estendere un'altra interfaccia, ma solo se questa non ha metodi astratti
	 *  - Può essere implementata usando la sintassi delle Anonymous Class
	 */
	
	
	//1. Implementazione con Anonymous inner class
	Printable printable = new Printable() {
	    
	    @Override
	    public void print(String message) {
		System.out.println(message);
		
	    }
	};
	
	printable.print("\nFunctional Interface - Anonymous iner class");
	
	//2. Implementazione con Lambda Expression
	Printable lambdaPrintable = (message) -> System.out.println(message);
	lambdaPrintable.print("\nFunctional Interface - Lambda Expression");
	
	
	
    }
    

}
