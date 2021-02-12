package it.esempi.java8.streams;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;

public class AsyncClass {

    public static void main(String[] args) {

	CompletableFuture.runAsync(() -> operazioneAsincrona()).thenAccept(r -> {
	    System.out.println("2. operazione asincrona terminata con successo");
	    try {
		System.out.println(
			"2.1 ora esegui una nuova operazione dato che l'operazione 1. ha terminato con successo");
	    } catch (Exception ex) {
		System.out.println("2.2 possibile eccezione: " + ex);
	    }
	}).exceptionally(t -> {
	    System.out.println("3. operazione asincrona 1. terminata con errore");
	    return null;
	});

	System.out.println("Blocco asincrono terminato");

    }

    private static void operazioneAsincrona() {
	System.out.println("1. qui va l'operazione asincrona");

    }

    private static void operazioneAsincrona2() throws InterruptedException {
	System.out.println("1. qui va l'operazione asincrona");
	Instant first = Instant.now();
	Thread.sleep(5000);
	Instant second = Instant.now();
	Duration duration = Duration.between(first, second);
	Thread.sleep(duration.toSeconds());
    }

}
