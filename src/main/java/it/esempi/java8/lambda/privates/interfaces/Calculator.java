package it.esempi.java8.lambda.privates.interfaces;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public interface Calculator {

    default int addNumeriPari(int... nums) {
	return add(n -> (n % 2 == 0), nums);
    }

    default int addNumeriDispari(int... nums) {
	return add(n -> (n % 2 != 0), nums);
    }

    private int add(IntPredicate predicate, int... nums) {
	return IntStream.of(nums).filter(predicate).sum();
    }

}
