package it.esempi.java8.lambda;

public class LambdaExample3 {
    
    public static void main(String[] args) {
	
	// Usando Anonymous class
	Runnable runnable = new Runnable() {
	    
	    @Override
	    public void run() {
		System.out.println("execute run... ");
		
	    }
	};
	
	Thread thread = new Thread(runnable);
	thread.start();
	
	
	// Usando Lambda Expression
	Runnable lambdaRunnable = () -> System.out.println("\nLambda execute run... ");
	Thread t = new Thread(lambdaRunnable);
	t.start();
    }
    

}
