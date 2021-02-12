package it.esempi.java8.lambda.sorting;

public class RunnableLambda {
    
    public static void main(String[] args) {
	
	System.out.println("=================  INTERFACCIA RUNNABLE ==================");
	
	// 1. Implementazione con Anonymous inner class
	Runnable runnable = new Runnable() {
	        
	        @Override
	        public void run() {
	    		System.out.println("\nAnonymous inner class - Thread.name: " +Thread.currentThread().getName());
	        } 
	   };
	   
	 Thread thread = new Thread(runnable);
	 thread.start();
	  
	// 2. Implementazione con Lambda Expression     
	 Thread lambdaThread = new Thread(() -> System.out.println("\nLambda Expression - Thread.name: " +Thread.currentThread().getName()));
	 lambdaThread.start();
	
    }
    
    

}
