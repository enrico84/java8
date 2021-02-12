package it.esempi.java8.lambda;

interface Drawable {
	void draw();
}

class DrawableImpl implements Drawable {

    @Override
    public void draw() {
	System.out.println("DrawableImpl --> Draw...");	
    }
    
}

public class LambdaExample {
    
    public static void main(String[] args) {
	
	Drawable drawable = new Drawable() {

	    @Override
	    public void draw() {
		System.out.println("Anonymous class --> Draw...");	
		
	    }
	};
	drawable.draw();
	
	Drawable lambdaDraw = () -> System.out.println("\nLambda --> Draw...");
	lambdaDraw.draw();
	
	
    }
    


}
