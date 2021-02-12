package it.esempi.java8.lambda.privates.interfaces;

public interface CustomInterface {

    public abstract void abstractMethod();

    public default void defaultMethod() {
	privateMethod();
	System.out.println("default method con un'implementazione");
    }

    public static void staticMethod() {
	privateStaticMethod();
	System.out.println("static method con un'implementazione");
    }

    private void privateMethod() {
	System.out.println("private method con un'implementazione");
    }

    private static void privateStaticMethod() {
	System.out.println("private static method con un'implementazione");

    }

}
