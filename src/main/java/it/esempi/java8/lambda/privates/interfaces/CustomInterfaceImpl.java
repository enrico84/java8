package it.esempi.java8.lambda.privates.interfaces;

public class CustomInterfaceImpl implements CustomInterface {

    public static void main(String[] args) {

	System.out
		.println("================= USO DI INTERFACE CON METODI DEFAULT, STATIC E PRIVATE ==================");

	CustomInterface customInterface = new CustomInterfaceImpl();
	customInterface.abstractMethod();
	customInterface.defaultMethod();
	CustomInterface.staticMethod();
    }

    @Override
    public void abstractMethod() {
	System.out.println("\nClasse CustomInterfaceImpl -> implementazione di abstract method");

    }

}
