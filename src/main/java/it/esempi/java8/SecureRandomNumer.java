package it.esempi.java8;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public class SecureRandomNumer {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {
	
	SecureRandom secRandom = SecureRandom.getInstance("SHA1PRNG", "SUN");
	
	// Ottiene 128 Random bytes
	byte randomBytes[] = new byte[128];
	secRandom.nextBytes(randomBytes);
	
	//Ottiene un numero random intero
	int randomInt = secRandom.nextInt();
	//secRandom.setSeed(secRandom.generateSeed(randomInt));
	System.out.println("Random intero: "+ randomInt);
	
	// Ottiene un numero random tra 0 e 99999
	int randomRange = secRandom.nextInt(99999);
	System.out.println("\nRandom intero tra 0 e 99999: "+ randomRange);
	

    }

}
